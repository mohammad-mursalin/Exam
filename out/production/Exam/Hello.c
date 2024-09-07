#include <stdio.h>
#include <stdlib.h>

#define MAX_VERTICES 100
#define MAX_COLORS 100

int adjMatrix[MAX_VERTICES][MAX_VERTICES]; // Adjacency matrix representation of the graph
int degrees[MAX_VERTICES]; // Degree of each vertex
int colors[MAX_VERTICES]; // Array to store the color assigned to each vertex

// Function to initialize the adjacency matrix
void initGraph(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            adjMatrix[i][j] = 0;
        }
        degrees[i] = 0;
        colors[i] = -1; // Initialize colors to -1 (unassigned)
    }
}

// Function to add an edge between vertices u and v
void addEdge(int u, int v) {
    adjMatrix[u][v] = adjMatrix[v][u] = 1;
    degrees[u]++;
    degrees[v]++;
}

// Function to assign colors to vertices using Welch-Powell algorithm
void welchPowell(int n) {
    int vertexOrder[MAX_VERTICES]; // Array to store the order of vertices after sorting
    for (int i = 0; i < n; i++) {
        vertexOrder[i] = i;
    }

    // Sort the vertices in non-increasing order of their degrees
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (degrees[vertexOrder[j]] < degrees[vertexOrder[j + 1]]) {
                int temp = vertexOrder[j];
                vertexOrder[j] = vertexOrder[j + 1];
                vertexOrder[j + 1] = temp;
            }
        }
    }

    // Assign colors to vertices
    for (int i = 0; i < n; i++) {
        int vertex = vertexOrder[i];
        int availableColors[MAX_COLORS] = {0}; // Array to keep track of available colors
        for (int j = 0; j < n; j++) {
            if (adjMatrix[vertex][j] && colors[j] != -1) {
                availableColors[colors[j]] = 1; // Mark the color of adjacent vertices as unavailable
            }
        }
        for (int j = 0; j < MAX_COLORS; j++) {
            if (!availableColors[j]) {
                colors[vertex] = j; // Assign the smallest available color
                break;
            }
        }
    }
}

// Function to print the colors assigned to each vertex
void printColors(int n) {
    printf("Colors assigned to vertices:\n");
    for (int i = 0; i < n; i++) {
        printf("Vertex %d: Color %d\n", i, colors[i]);
    }
}

int main() {
    int n, m; // Number of vertices and edges
    printf("Enter the number of vertices and edges: ");
    scanf("%d %d", &n, &m);
    initGraph(n);

    printf("Enter the edges (vertex pairs):\n");
    for (int i = 0; i < m; i++) {
        int u, v;
        scanf("%d %d", &u, &v);
        addEdge(u, v);
    }

    welchPowell(n);
    printColors(n);

    return 0;
}

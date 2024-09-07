import java.util.Scanner;

public class FloydWarshall {
    // final static int INF = 99999;

    // // Method to implement Floyd-Warshall algorithm
    // void floydWarshall(int graph[][]) {
    //     int V = graph.length;
    //     int dist[][] = new int[V][V];

    //     // Initialize the distance matrix
    //     for (int i = 0; i < V; i++) {
    //         for (int j = 0; j < V; j++) {
    //             dist[i][j] = graph[i][j];
    //         }
    //     }

    //     // Apply Floyd-Warshall algorithm
    //     for (int k = 0; k < V; k++) {
    //         for (int i = 0; i < V; i++) {
    //             for (int j = 0; j < V; j++) {
    //                 if (dist[i][k] + dist[k][j] < dist[i][j]) {
    //                     dist[i][j] = dist[i][k] + dist[k][j];
    //                 }
    //             }
    //         }
    //     }

    //     // Print the shortest path matrix
    //     printSolution(dist);
    // }

    // // A utility method to print the solution
    // void printSolution(int dist[][]) {
    //     int V = dist.length;
    //     System.out.println("The shortest paths between every pair of vertices:");
    //     for (int i = 0; i < V; i++) {
    //         for (int j = 0; j < V; j++) {
    //             if (dist[i][j] == INF) {
    //                 System.out.print("INF ");
    //             } else {
    //                 System.out.print(dist[i][j] + " ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     // Example graph represented as an adjacency matrix
    //     int graph[][] = {
    //         {0, 3, INF, 7},
    //         {8, 0, 2, INF},
    //         {5, INF, 0, 1},
    //         {2, INF, INF, 0}
    //     };

    //     FloydWarshall fw = new FloydWarshall();
    //     fw.floydWarshall(graph);
    // }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of vertices : ");
        int v = scanner.nextInt();

        int[][] matrix = new int[v][v];

        System.out.println("Give the values and for infinity give 100 : ");

        for(int i = 1 ; i <= v ; i++ ) {

            for(int j = 0 ; j < v ; j++) {

                System.out.print("matrix[" +i+ "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }

        }

        for(int k = 0 ; k < v ; k++) {

            for(int i = 0 ; i < v ; i++ ) {

                for(int j = 0 ; j < v ; j++) {
    
                    if( matrix[i][j] < matrix[i][k] + matrix[k][j] ){

                        matrix[i][j] = matrix[i][j];
                    }
                    else {

                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
    
            }
        }

        System.out.println("Shortest distance between every pair of vertices : ");

        for(int i = 0 ; i < v ; i++ ) {

            for(int j = 0 ; j < v ; j++) {

                if(matrix[i][j] >= 100)

                    System.out.print("INF ");
                else

                    System.out.print(matrix[i][j]+" ");
            
            }
            
            System.out.println();
        }

        scanner.close();

    }
}

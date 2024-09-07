import java.util.*;

public class WelchPowell {

    public static void main(String[] args) {
        // Sample graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 2, 3));
        graph.put(2, Arrays.asList(0, 1, 4));
        graph.put(3, Arrays.asList(1, 4));
        graph.put(4, Arrays.asList(2, 3));

        // Color the graph
        Map<Integer, Integer> vertexColors = colorGraph(graph);

        System.out.println("Vertex Coloring:");
        for (Map.Entry<Integer, Integer> entry : vertexColors.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + " - Color: " + entry.getValue());
        }
    }

    private static Map<Integer, Integer> colorGraph(Map<Integer, List<Integer>> graph) {
        // Get all vertices and sort them by degree (descending)
        List<Integer> vertices = new ArrayList<>(graph.keySet());
        Collections.sort(vertices, (v1, v2) -> Integer.compare(graph.get(v2).size(), graph.get(v1).size()));

        // Assign colors to vertices
        Map<Integer, Integer> vertexColors = new HashMap<>();
        for (Integer vertex : vertices) {
            Set<Integer> availableColors = new HashSet<>();
            for (Integer neighbor : graph.get(vertex)) {
                if (vertexColors.containsKey(neighbor)) {
                    availableColors.add(vertexColors.get(neighbor));
                }
            }
            int color = 0;
            while (availableColors.contains(color)) {
                color++;
            }
            vertexColors.put(vertex, color);
        }

        return vertexColors;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphColoring {
    public static void main(String[] args) {
        
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0,Arrays.asList(1,2));
        graph.put(1, Arrays.asList(0, 2, 3));
        graph.put(2, Arrays.asList(0, 1, 4));
        graph.put(3, Arrays.asList(1, 4));
        graph.put(4, Arrays.asList(2, 3));

        List<Integer> vertices = new ArrayList<>(graph.keySet());

        Collections.sort(vertices,(v1,v2) -> Integer.compare(graph.get(v2).size(),graph.get(v1).size()));
        
        Map<Integer,Integer> vertexColors = new HashMap<>();

        for(Integer vertex : vertices) {

            Set<Integer> adjacentVerticesColors = new HashSet<>();

            for(Integer adjacentVertex : graph.get(vertex)) {

                if(vertexColors.containsKey(adjacentVertex)) {

                    adjacentVerticesColors.add(vertexColors.get(adjacentVertex));
                }
            }

            int color = 0;

            while(adjacentVerticesColors.contains(color)) {

                color++;
            }

            vertexColors.put(vertex, color);
        }

        System.out.println("Vertex coloring : ");

        // for (Map.Entry<Integer, Integer> entry : vertexColors.entrySet()) {

        //     System.out.println("Vertex " +entry.getKey()+ " -color : "+entry.getValue());
        // }

        for (Integer vertex : vertexColors.keySet()) {

            System.out.println("Vertex " +vertex+ " -color : "+vertexColors.get(vertex));
        }
    }

}





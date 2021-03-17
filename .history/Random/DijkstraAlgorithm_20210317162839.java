import java.util.*;
import java.io.*;
import java.lang.*;


public class DijkstraAlgorithm {

    public static void main(String[] args) {
        
    }

    public static void dijkstra(int[][] graph) {

        boolean[] visited = new boolean[graph.length];
        var distance = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < graph.length ; i++) {
            distance.put(i, Integer.MAX_VALUE);                       
        }
        int vertex = minimum(visited,graph,distance);
        var notVisited = new HashSet<Integer>();
        for(int i = 0 ; i < graph.length; i++) {
            notVisited.add(i);
        }
        notVisited.remove(vertex);
        while(!notVisited.isEmpty()) {

            int row = vertex;
            for(int column = 0; column < graph.length;column++) {
                if(graph[row][column] > 0) {
                    if(distance.get(vertex) + graph[row][column] < distance.get(column)){
                        distance.remove(column);
                        distance.put(column,distance.get(vertex) + graph[row][column]);
                    }
                }
            }
            visited[vertex] = true;
            notVisited.remove(vertex);
            vertex = minimum(visited,graph,distance);
            
        }

        
        
    }

    private static int minimum(boolean[] visited, int[][] graph, HashMap<Integer, Integer> distance) {
        return 0;
    }

}
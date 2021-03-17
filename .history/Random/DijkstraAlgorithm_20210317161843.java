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
        
        while()

        
        
    }

    private static int minimum(boolean[] visited, int[][] graph, HashMap<Integer, Integer> distance) {
        return 0;
    }

}
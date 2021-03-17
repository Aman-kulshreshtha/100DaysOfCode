import java.util.*;
import java.io.*;
import java.lang.*;


public class DijkstraAlgorithm {

    public static void main(String[] args) {
        var graph = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

                dijkstra(graph);
    }

    public static void dijkstra(int[][] graph) {

        boolean[] visited = new boolean[graph.length];
        var distance = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < graph.length ; i++) {
            distance.put(i, Integer.MAX_VALUE);                       
        }
        distance.put(0,0);
        int vertex = minimum(visited,graph,distance);
        var notVisited = new HashSet<Integer>();
        for(int i = 0 ; i < graph.length; i++) {
            notVisited.add(i);
        }
        
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

        for(int i = 0 ; i < graph.length;i++) {
            System.out.println(i + "   " + distance.get(i));
        }
        
        
    }

    private static int minimum(boolean[] visited, int[][] graph, HashMap<Integer, Integer> distance) {
        int min ;
        while(visited[min]) {
            min++;
        }
        for(int i = 0 ; i < graph.length ; i++) {
            if(!visited[i] && distance.get(i) < distance.get(min)) {
                min = i;
            }
        }

        return min;
    }

}
import java.util.*;
import java.io.*;
import java.lang.*;


public class DijkstraAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            var arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            Collections.sort(arr);
            var temp = new ArrayList<Integer>();
            var ans = new ArrayList<Integer>();
            var set = new HashSet<Integer>();
            boolean flag = true;
            while (flag) {
                for (int x : arr) {
                    if (set.contains(x)) {
                        temp.add(x);
                    } else {
                        set.add(x);
                        ans.add(x);
                    }
                }

                if (temp.isEmpty()) {
                    flag = false;
                } else {
                    arr.clear();
                    arr.addAll(temp);
                    temp.clear();
                    set.clear();
                }
            }

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();

        }
        sc.close();
        System.exit(0);

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
        int min = 0;
        while( min < graph.length && visited[min]) {
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
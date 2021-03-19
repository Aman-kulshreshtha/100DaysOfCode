
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {

      static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        var sc = new FastReader();
        var output = new StringBuilder();
        int t = sc.nextInt();

        while(t-- > 0) {

            var expectedTime = new ArrayList<Pair>();
            var timeDelay = new ArrayList<Integer>();
            int n = sc.nextInt();
            for(int i = 0 ; i < n ; i++) {
                expectedTime.add(new Pair(sc.nextInt(),sc.nextInt()));
            }
            for(int i = 0 ; i < n ;i++) {
                timeDelay.add(sc.nextInt());
            }
            var timeToTravel = new long[n+1];
            timeToTravel[1] = expectedTime.get(0).arrival  + timeDelay.get(0);
            for(int i = 2 ; i <= n ; i++) {
                timeToTravel[i] = expectedTime.get(i-1).arrival - expectedTime.get(i-2).departure + timeDelay.get(i-1);
            }

           var duration = new long[n];
           duration[0] = 0;

           for(int i = 1; i < n ;i++) {
               duration[i] =(long) Math.ceil((expectedTime.get(i-1).departure - expectedTime.get(i-1).arrival)/2.0);
           }
           long time = 0 ;
           for(int i = 1 ;i <=  n; i++  ) {
               time += timeToTravel[i] ;
               if(i < n) {
                   time += duration[i];
                   if(time < expectedTime.get(i-1).departure){
                       time = expectedTime.get(i-1).departure;
                   }
               }
           }

          output.append(time);
          output.append('\n');

        }

        System.out.print(output.toString());
       /*  sc.close(); */
        System.exit(0);        
    }
}

class Pair {
    public long arrival;
    public long departure;
    public Pair(int first,int second) {
        this.arrival = first;
        this.departure = second;
    }

}
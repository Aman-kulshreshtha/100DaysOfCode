import java.util.*;
import java.io.*;
import java.lang.*;


public class CeilAndReceipt {

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
        FastReader sc = new FastReader();
        StringBuilder output = new StringBuilder();
        int t = sc.nextInt();
        while(t-- > 0) {
            int dishCount = 0;
            int n  = sc.nextInt();
            dishCount += n/2048;
            n = n%2048;

            while(n > 0 ) {
                dishCount
            }


        }





        System.out.print(output.toString());
    }
}
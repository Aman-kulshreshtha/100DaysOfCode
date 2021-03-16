import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;


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
      	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        var fact = new BigInteger("1");
        for(int i = 1 ; i <= n ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        System.out.println(fact);
        sc.close();
        System.exit(0);
    }
}
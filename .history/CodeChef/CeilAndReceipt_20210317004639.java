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
        boolean[] sieve = new boolean[100001];
        sieve[2] = true;
        for (int i = 0; i < 100001; i++) {
            sieve[i] = true;
        }

        for (int i = 2; i * i <= 100000; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    sieve[j] = false;
                }
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (sieve[x]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        System.exit(0);
    }
}
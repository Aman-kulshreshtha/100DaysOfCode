
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class NapoleanCake {

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
        
        FastReader  sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] cake = new int[n];
            for(int i = 0 ; i < n ;i++) {
                int cream  = sc.nextInt();
                if(i != n-1 && cream != 0) {
                    cake[i+1]--;
                }
                if(cream != 0) {
                    if (i + 1 - cream >= 0) {
                        cake[i + 1 - cream]++;
                    } else {
                        cake[0]++;
                    }
                }
               

                
            }
            for(int k = 1 ; k < n ; k++) {
                cake[k] += cake[k-1];
            }
            
         
            for(int k = 0 ; k <n; k++) {
                if(cake[k] >0) {
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
                
            }
            System.out.println();

        }
        
        System.exit(0);
    }
}


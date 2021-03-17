import java.util.*;
import java.io.*;
import java.lang.*;


public class DijkstraAlgorithm {

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
       
        System.exit(0);

    }

}
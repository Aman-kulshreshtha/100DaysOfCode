import java.util.*;
import java.io.*;
import java.lang.*;


public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            var ans = new ArrayList<Integer>();
            
            var set = new HashSet<Integer>();
            boolean flag = true;
            while(flag){
                var temp = new ArrayList<Integer>();

                for (int x : arr) {
                    if (set.contains(x)) {
                        temp.add(x);
                    } else {
                        ans.add(x);
                    }
                    set.add(x);
                }
                if(temp)
            }
          
        }
        sc.close();
        System.exit(0);

    }
}

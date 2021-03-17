import java.util.*;
import java.io.*;
import java.lang.*;


public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            var arr = new ArrayList<Integer>();
            for(int i = 0 ; i < n ; i++) {
                arr.add(sc.nextInt());
            }

            Collections.sort(arr);
            var temp = new ArrayList<Integer>();
            var ans = new ArrayList<Integer>();
            var set = new HashSet<Integer>();
            boolean flag = true;
            while(flag) {
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
                }else {
                    arr.clear();
                    arr.addAll(temp);
                    temp.clear();
                    set.clear();
                }
            }

            for(int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
           
                     
        }
        sc.close();
        System.exit(0);

    }
}

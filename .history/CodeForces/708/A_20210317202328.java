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

            Collections.sort(arr)

                    
        }
        sc.close();
        System.exit(0);

    }
}

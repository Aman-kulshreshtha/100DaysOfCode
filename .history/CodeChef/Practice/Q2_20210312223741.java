package Practice;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
          long a = sc.nextLong();
          long b = sc.nextLong();
          System.out.print(Math.max(a,b) + " "+ (a+b));
        }
        sc.close();
        System.exit(0);
    }
}

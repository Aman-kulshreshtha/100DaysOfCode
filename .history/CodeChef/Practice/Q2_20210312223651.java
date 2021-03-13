package Practice;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a < b) {
                System.out.println("<");

            } else if (a == b) {
                System.out.println("=");
            } else {
                System.out.println(">");
            }
        }
        sc.close();
        System.exit(0);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean flag = true;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long moves = 0;
            for (int i = 0; i < n; i++) {
                while (arr[i] < i + 1) {
                    arr[i]++;
                    flag = flag ? false : true;
                }
            }
            if (flag) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        sc.close();
        System.exit(0);

    }    
}

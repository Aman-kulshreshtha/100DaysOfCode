import java.util.*;

class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            boolean flag = true;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long moves = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < i + 1) {
                    moves += i + 1 - arr[i];
                }
            }
           if (moves % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
        sc.close();
        System.exit(0);

    }    
}

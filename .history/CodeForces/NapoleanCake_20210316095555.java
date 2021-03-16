import java.util.*;

public class NapoleanCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] cake = new int[n];
            for(int i = 0 ; i < n ;i++) {
                
            }
         
            for(int k = cake.size()-1 ; k >= 0; k--) {
                if(cake.get(k)) {
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();

        }
        sc.close();
        System.exit(0);
    }
}


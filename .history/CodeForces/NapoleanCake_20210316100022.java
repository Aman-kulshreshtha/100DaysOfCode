import java.util.*;

public class NapoleanCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] cake = new int[n];
            for(int i = 0 ; i < n ;i++) {
                int cream  = sc.nextInt();
                if(i != n-1) {
                    cake[i+1]--;
                    if(i+1-cream >= 0 ) {
                        cake[i+1-cream]++;
                    }else  {
                        cake[0]++;
                    }

                }
            }
            for(int k = 0 ; k < n ; k++) {
                cake[]
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


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
                if(i != n-1 && cream != 0) {
                    cake[i+1]--;
                    }
                    
                    if(i+1-cream >= 0 ) {
                        cake[i+1-cream]++;
                    }else  {
                        cake[0]++;
                    }

                
            }
            for(int k = 1 ; k < n ; k++) {
                cake[k] += cake[k-1];
            }
            
         
            for(int k = 0 ; k <n; k++) {
              /*   if(cake[k] >0) {
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                } */
                 System.out.print(cake[k] + " ");
            }
            System.out.println();

        }
        sc.close();
        System.exit(0);
    }
}


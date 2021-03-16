import java.util.*;

public class NapoleanCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            var cake = new ArrayDeque<Boolean>();

            for(int i = 0 ; i < n ; i++) {
                cake.addFirst(false);
                int cream = sc.nextInt();
                if(cream > cake.size()) {
                    for(int i = 0 ; i < cake.size())
                }
            }
        }
        sc.close();
        System.exit(0);
    }
}


import java.util.*;

public class NapoleanCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            var cake = new ArrayList<Boolean>();

            for(int i = 0 ; i < n ; i++) {
                cake.add(0,false);;
                int cream = sc.nextInt();
                if(cream > cake.size()) {
                    for(int j = 0 ; j < cake.size(); j++) {
                        cake.set(j,true);
                    }
                }else {
                    for (int j = 0; j < cream ; j++) {
                        cake.set(j, true);
                    }
                }
            }
            
        }
        sc.close();
        System.exit(0);
    }
}


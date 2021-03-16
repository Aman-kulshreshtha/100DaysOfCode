import java.util.*;

public class NapoleanCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            var cake = new ArrayDeque<Layer>();

            for(int i = 0 ; i < n ; i++) {
                cake.addFirst(new Layer());
                
            }
        }
        sc.close();
        System.exit(0);
    }
}

class Layer {    
    public boolean isDrenched;
    public Layer() {        
        isDrenched = false;
    }

}
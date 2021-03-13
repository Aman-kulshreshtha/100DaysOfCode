
import java.util.*;

public class ATrivialProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Numbers[] arr = new Numbers[100001];
        for(int i =0 ; i <= 10000;i++) {
            arr[i] = new Numbers();            
        }
        int i = 1;
        while(true) {
            try {
                int n = getTrailZeroes(i);
                arr[n].add(i);
                i++;
            }catch(Exception e) {
                break;
            }
        }

        System.out.println(arr[m].size());
        arr[m].show();

    }

    private static int getTrailZeroes(int n) {
        int ans = 0;
        int i = 1;
        while(n / Math.pow(5,i) > 0) {
            ans += n / Math.pow(5,i++) ;
        }
        return ans;
    }
}

class Numbers {
    LinkedList<Integer> numbers;
    public Numbers() {
        numbers = new LinkedList<Integer>();
    }
    public void add(int x) {
        numbers.add(x);
    }

    public int size() {
        return numbers.size();

    }
    public void show() {
        for(int number : numbers) {
            print
        }
    }


}
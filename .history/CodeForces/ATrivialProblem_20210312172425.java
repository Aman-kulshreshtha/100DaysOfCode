
import java.util.*;

public class ATrivialProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Numbers[] arr = Numbers[100001];
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
        for(int number : arr[m]) {
            System.out.print(number+ " ");
        }

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
    public Numbers(int x) {
        numbers = new LinkedList<Integer>();
    }
    public void add(int x) {
        numbers.add(x);
    }

    public int size() {
        return numbers.size();

    }


}
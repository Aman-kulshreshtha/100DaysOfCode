
import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Numbers> arr = new ArrayList<>();
        for(int i =0 ; i < 100001;i++) {
            arr.add(new Numbers());            
        }
        int i = 1;
        while(true) {
            try {
                int n = getTrailZeroes(i);
                arr.get(n).add(i);
                i++;
            }catch(Exception e) {
                break;
            }
        }

        System.out.println(arr.get(m).size());
        arr.get(m).show();

        sc.close();
        System.exit(0);

    }

    private static int getTrailZeroes(int n) {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
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
            System.out.print(number + " ");
        }
    }


}
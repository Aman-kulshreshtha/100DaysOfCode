public class ATrivialProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        LinkedList<Integer>[] arr = new LinkedList<Integer>[100001];
        for(int i =0 ; i <= 10000;i++) {
            arr[i] = new LinkedList<Integer>();            
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

    private int getTrailZeroes(int n ) {
        
        return 0;
    }
}

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
                arr[n]
            }catch(Exception e) {
                break;
            }
        }


    }
}
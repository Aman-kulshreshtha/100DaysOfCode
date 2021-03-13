import java.util.*;

public class BinaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[][] mat = new int[n][n];
            HashSect<Integer> rows = new HashSet<Integer>();
            HashSet<Integer> columns = new HashSet<Integer>();

            for(int row = 0; row < N ; row++) {
                for(int column = 0 ; column < N ; column++) {
                    mat[row][column] = sc.nextInt();
                    if(mat[row][column] == 0) {
                        rows.add(row);
                        columns.add(column);
                    }
                }
            }

            for(int row : rows) {
                for(int column = 0 ; column < N ; column)
            }
        }
    }
}

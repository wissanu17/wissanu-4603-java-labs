
import java.util.Arrays;

public class MultiDimArrayEx {
    static int rowSorting(int arr[][]) {
        for (int i = 0; i < arr.length - 1; i++) {
            Arrays.sort(arr[i]);
            }

            for (int i = 0; i < arr.length; i++){
                for (int j  = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                    System.out.println();
            }
            return 0;
    }
    public static void main(String[] args) {
        int arr[][] = new int [][] {
            {1, 8, 7, 6},
                {5, 3},
                    {3, 2, 6}
        } ;
        Arrays.fill(arr[2], 3);
        rowSorting(arr);
    }
}
    
// 653040460-3 is my student id
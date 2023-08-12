package MatrixSearch;

import java.util.Arrays;

public class RowColMatrixSearch {
    public static void main(String[] args) {
     int [][]arr={
             {15,20,25,30},
             {17,21,27,35},
             {19,24,29,37},
     };
        int target=29;
        System.out.println(Arrays.toString(MatrixSearch(arr,target)));

    }
    static int[] MatrixSearch(int[][] matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0)
        {
            if(matrix [r][c]==target)
            {
                return new int[]{r,c};
            }
            if (matrix[r][c]<target)
            {
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}

package linearSearch;

import java.util.Arrays;

public class search2DArray {

    public static void main(String[] args) {

        int[][] arr={
                {10,33,21,12},
                {76,45,32,90},
                {11,44,30,79},
                {12,33,24}
        };
        int target=12;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] search(int[][] arr,int target)
    {
        for (int row=0;row<arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                if (arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

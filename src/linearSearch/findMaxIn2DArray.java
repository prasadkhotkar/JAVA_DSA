package linearSearch;

import java.util.Arrays;

public class findMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {10,33,21,12},
                {76,45,32,90},
                {11,44,30,79},
                {12,33,24}
        };
        int target=12;
        int ans=search(arr);
        System.out.println(ans);
    }
    static int search(int[][] arr)
    {
        int max=arr[0][0];
        for (int row=0; row<arr.length;row++)
        {
            for (int col=0;col<=arr[row].length;col++)
            {
                if (arr[row][col]>max)
                {
                    max=arr[row][col];
                }
            }

        }
        return max;
    }

}

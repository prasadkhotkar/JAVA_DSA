package insertionSort;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr={-10,33,-2,0,3,4,-19};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr)
    {
        for (int i=0;i< arr.length-1;i++)
        {
            for (int j=i+1;j>0;j--)
            {
                if (arr[j]<arr[j-1])
                {
                    Swap(arr,j,j-1);
                }
            }
        }
    }
    static void Swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

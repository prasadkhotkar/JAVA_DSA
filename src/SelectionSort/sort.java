package SelectionSort;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr={-10,33,-2,0,3,4,-19};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr)
    {
        for (int i=0;i< arr.length;i++)
        {
            int last= arr.length-i-1;
            int max=getmax(arr,0,last);
            Swap(arr,max,last);
        }
    }
    static void Swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getmax(int[] arr,int start,int end)
    {
        int max=start;
        for (int i=start;i<=end;i++)
        {
            if (arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}

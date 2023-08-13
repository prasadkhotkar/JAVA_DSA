package CyclicSort;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
      int i=0;
      while (i< arr.length)
      {
          int correct=arr[i]-1;
          if (arr[i]!=arr[correct])
          {
              swap(arr,i,correct);
          }else {
              i++;
          }
      }
    }
    static void swap(int[] arr,int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}

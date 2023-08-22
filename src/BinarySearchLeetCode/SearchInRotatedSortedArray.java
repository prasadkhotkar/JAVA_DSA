package BinarySearchLeetCode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
 int[] arr={4,5,6,7,0,1,2};
        System.out.println(SearchingPivot(arr));
    }
   static int search(int[] arr, int target) {
     int pivot=SearchingPivot(arr);

     // if you do not found pivot then array is not rotated
     if (pivot==-1)
     {
         return BSearch(arr,target,0 ,arr.length-1);
     }
     if (arr[pivot]==target)
     {
         return pivot;
     }
     if (target>=arr[0])
     {
         return BSearch(arr,target,0,pivot-1);
     }
    return BSearch(arr,target,pivot+1, arr.length-1);
    }



    static int SearchingPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
  static int BSearch(int[] arr,int target,int start,int end)
    {


        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (target>arr[mid])
            {
                start=mid+1;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else {

                return mid;
            }
        }
        return -1;
    }
}


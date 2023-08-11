package BinarySearch;

public class AgnosticBSearch {
    public static void main(String[] args) {
        int[] arr = {100,90,80,70,60,50,40,30,20,10};
        int target = 1000;
        int ans = orderAgnosticBSearch(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //check array is ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {

                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }


        }
        return -1;
    }
}
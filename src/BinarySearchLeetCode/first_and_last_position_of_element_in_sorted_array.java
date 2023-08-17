package BinarySearchLeetCode;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class first_and_last_position_of_element_in_sorted_array {
    public int[] searchRange(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if (target>arr[mid])
            {
                start=mid+1;
            }
            else  {
                end = mid - 1;
            }
        }
//        return arr[start % arr.length];
        return new int[]{-1};
    }
    }


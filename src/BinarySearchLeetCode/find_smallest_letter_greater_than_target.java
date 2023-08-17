package BinarySearchLeetCode;

public class find_smallest_letter_greater_than_target {
    public char nextGreatestLetter(char[] arr, char target) {
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
        return arr[start % arr.length-1];
    }
    }


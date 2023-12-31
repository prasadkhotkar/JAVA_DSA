package CyclicSortLeetcode;

import java.util.Arrays;

class missingNumber {

    public int missingNumber(int[] nums) {

        int i=0;
        while (i< nums.length)
        {
            int correct=nums[i];
            if (nums[i]< nums.length && nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        //searching the missing number
        for (int index=0;index<nums.length;index++)
        {
            if (nums[index]!=index)
            {
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr,int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}

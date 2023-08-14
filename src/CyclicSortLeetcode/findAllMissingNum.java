package CyclicSortLeetcode;

import java.util.ArrayList;
import java.util.List;

class findAllMissingNum {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i=0;
        while (i< nums.length)
        {
            int correct=nums[i]-1;
            if ( nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        //searching the missing numbers
        List<Integer> ans=new ArrayList<>();
        for (int index=0;index<nums.length;index++)
        {
            if (nums[index]!=index+1)
            {
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    }


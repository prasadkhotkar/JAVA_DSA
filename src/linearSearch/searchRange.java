package linearSearch;

public class searchRange {
    public static void main(String[] args) {
        int[] arr={10,29,39,40,23,44,21,55,32,23,77,87,67,13};
        int target=40;
        int ans=search(arr,target,2,9);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int start,int end)
    {
        for (int index=start;index<end;index++)
        {
            int element=arr[index];
            if (element==target)
            {
                return index;
            }
        }
        return -1;
    }
    }


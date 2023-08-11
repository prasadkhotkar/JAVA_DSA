package linearSearch;

public class targetEle {
    public static void main(String[] args) {
        int[] arr={10,29,39,40};
        int target=40;
      int ans=linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target)
    {
        for (int index=0;index< arr.length;index++)
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

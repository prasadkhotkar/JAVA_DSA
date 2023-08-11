package linearSearch;

public class findMin {
    public static void main(String[] args) {
        int[] arr={10,29,39,40,23,44,21,55,32,7,23,77,87,67,13};
        int ans=Minimun(arr);
        System.out.println(ans);
    }

    static int Minimun(int[] arr)
    {
        int min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }

        }
        return min;
    }
}

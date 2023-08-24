package Recursion;

public class sum {
    public static void main(String[] args) {
        int ans=sum(10);
        System.out.println(ans);
    }
    static int sum(int n)
    {
        if (n<2)
        {
            return n;
        }
        return sum(n-1)+n;
    }
}

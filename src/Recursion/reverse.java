package Recursion;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    static int reverse(int n)
    {
        int sum=0;
       if (sum==0)
       {
           return 0;
       }
       int rem=n%10;
       return n*10+reverse(n/10)+sum;
    }
}

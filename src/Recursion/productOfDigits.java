package Recursion;

public class productOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(101));
    }
    static int productOfDigits(int n)
    {
        if (n==0)
        {
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }
}

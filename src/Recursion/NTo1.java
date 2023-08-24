package Recursion;

public class NTo1 {
    public static void main(String[] args) {
        reverse(10);
    }
    static void Nto1(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        Nto1(n-1);
    }

    static void reverse(int n)
    {
        if (n==0)
        {
            return;
        }
        reverse(n-1);
        System.out.println(n);
    }
}

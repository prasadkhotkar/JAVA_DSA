package Recursion;

public class NTo1 {
    public static void main(String[] args) {
        both(5);
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
    static void both(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}

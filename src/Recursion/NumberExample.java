package Recursion;

public class NumberExample {
    public static void main(String[] args) {
        printNumber(1);
    }
    static  void printNumber(int n)
    {
        if(n==5)
        {
            System.out.println(5);
            return;
        }

        System.out.println(n);
        printNumber(n+1);
    }
}

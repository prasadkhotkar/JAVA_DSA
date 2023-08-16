package pattern;

public class pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    }
}

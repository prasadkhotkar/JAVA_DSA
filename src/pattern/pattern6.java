package pattern;

public class pattern6 {
    public static void main(String[] args) {
           pattern6(5);
    }
    static void pattern6(int n)
    {
        for (int i = 1; i <= 2*n-1; i++) {
          int totalcol=i>n?2*n-i-1:i;
            for (int j = 1; j <= totalcol ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

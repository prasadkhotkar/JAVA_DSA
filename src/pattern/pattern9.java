package pattern;

public class pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n)
    {
        for (int i=0;i<2*n;i++)
        {
            int totalcol=i>n?2*n-i:i;
            for (int j=0;j<totalcol;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

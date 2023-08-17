package pattern;

public class pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n)
    {
        for (int i =0; i < 2*n-1; i++) {
            int totalcol=i>n?2*n-i-1:i-1;
            for (int j =0; j < totalcol ; j++) {
                System.out.print("* ");
            }
            int NoOfSpaces=2*n-i-1;
            for (int s=0;s<NoOfSpaces;s++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


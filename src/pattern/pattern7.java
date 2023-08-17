package pattern;
       /*
             *
            * *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *

        */
public class pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n)
    {
        for (int i = 1; i <= 2*n-1; i++) {
            int totalcolInRow=i>n?2*n-i : i;
            int NoSpaces=n-totalcolInRow;
            for (int s=0;s<NoSpaces;s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j < totalcolInRow ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

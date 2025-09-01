import java.util.Scanner;

public class PrintPatterns {//start of the class

    //pattern - 1
    public static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //pattern -2
    public static void pattern2(int n)
    {
        for(int i=0 ; i<n ;i++)
        {
            for(int j=0 ; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //pattern -3
    public static void pattern3(int n)
    {
        for(int i=1 ; i<=n ;i++)
        {
            for(int j=1 ; j <=i ; j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    //pattern -4
    public static void pattern4(int n)
    {
        for(int i=1 ; i<=n ;i++)
        {
            for(int j=1 ; j <=i ; j++)
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {//start of main
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = in.nextInt();

        
        pattern4(n);
    }//end of main
}//end of class

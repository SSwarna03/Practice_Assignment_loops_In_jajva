import java.util.*;
class Question6
{
    public static void main(String args[])
    {
        int number=5;
        for(int p=0;p<3;p++)
        {
            for(int q=0;q<2*p+1;q++)
                System.out.print("*");
            System.out.println();
        }
        for(int p=1;p>=0;p--)
        {
            for(int q=0;q<2*p+1;q++)
                System.out.print("*");
            System.out.println();
        }

    }
}
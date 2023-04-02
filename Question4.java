import java.util.*;
public class Question4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String string="y";
        while(!string.equals("n"))
        {
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.print("Please enter the number: ");
            int num=sc.nextInt();
            if(num%2==0)
                System.out.println("The given number - "+num+"  is an EVEN Number");
            else
                System.out.println("The given number - "+num+"  is an ODD Number");
                System.out.print("Do you want to Continue: ");
                string=sc.next();
                System.out.println("\n\n");


        }
    }
}

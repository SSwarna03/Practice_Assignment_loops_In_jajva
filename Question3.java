import java.util.*;
class Question3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number1= ");
        int n1=sc.nextInt();
        System.out.print("Number2= ");
        int n2=sc.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("\n After Swapping the numbers: \n Num1= "+n1+" \n Num2= "+n2);
    }
}

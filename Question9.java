import java.util.*;
class Question9
{
    public static boolean isprime(int num)
    {
        if(num==1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(isprime(num))
            System.out.println("The given number "+num+" is a Prime number.");
        else
            System.out.println("The given number "+num+" is NOT a Prime number.");
    }
}

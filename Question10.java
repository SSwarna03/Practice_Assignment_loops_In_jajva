import java.util.Scanner;
class Question10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("StringName: ");
        String str=sc.next();
        System.out.print("Starting index: ");
        int first=sc.nextInt();
        System.out.print("Ending index: ");
        int last=sc.nextInt();
        System.out.print("subString of "+str+" from "+first+" to " +last+" is :   "+str.substring(first,last+1));
    }
}
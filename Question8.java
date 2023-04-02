import java.util.*;
class Question8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int minNum=p,maxNum=p;
        float avg=(float)(p+q+r)/3;
        if(minNum>q)
            minNum=q;
        if(maxNum<q)
            maxNum=q;
        if(minNum>r)
            minNum=r;
        if(maxNum<r)
            maxNum=r;
    System.out.println("The Smallest Number: "+minNum);
    System.out.println("The Largest Number: "+maxNum);
    System.out.println("Average of all three numbers: "+avg);
    }
}

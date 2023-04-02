import java.util.*;
class Question2
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Marks obtained by the Student :");       
        int gain_mrks = scan.nextInt();
        System.out.println("Enter Total Marks :");
         int Overal_mrks=scan.nextInt();
        float percentage = (gain_mrks/(float)Overal_mrks)*100;
        System.out.println("Percentage: "+ percentage+"%");
        if(percentage>=0 && percentage<=59)
            System.out.println("Grade F , GPA = 0.0");
        else if(percentage>=60 && percentage<=69)
            System.out.println("Grade D , GPA = 1.0");
        else if(percentage>=70 && percentage<=79)
            System.out.println("Grade C , GPA = 2.0");
        else if(percentage>=80 && percentage<=89)
            System.out.println("Grade B , GPA = 3.0");
        else if(percentage>=90 && percentage<=100)
            System.out.println("Grade A , GPA = 4.0");
    }
}
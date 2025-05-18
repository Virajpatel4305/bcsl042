import java.util.Scanner;
public class exc4
{
    public static void main(String args[])
     {
        int marks[]=new int[5];
        Scanner in = new Scanner(System.in);
        int total=0;
        for(int i=0;i<5;i++){
            System.out.println("enter marks:-> ");
            marks[i]=in.nextInt();
        total = total + marks[i];
            }
            double average = total /5;
            System.out.println("the Average =" +average);
    }
}
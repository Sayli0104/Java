import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an year:");
        int year = s.nextInt();
        boolean leap = false;
        if(year % 400 == 0)
        {
            leap = true;
        }
        else if (year % 100 == 0)
        {
            leap = false;
        }
        else if(year % 4 == 0)
        {
            leap = true;
        }
        else
        {
            leap = false;
        }
        if(leap)
        {
            System.out.println("Year is a Leap Year");
        }
        else
        {
            System.out.println("Year is not a Leap Year");
        }
    }
}
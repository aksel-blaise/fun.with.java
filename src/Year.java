import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (leapYear)   {
            System.out.println(year + " is a leap year");
        }
        else    {
            System.out.println(year + " is not a leap year");
        }

    }
}

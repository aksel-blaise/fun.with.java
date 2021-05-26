import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if(number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

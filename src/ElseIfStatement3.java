import java.util.Scanner;

public class ElseIfStatement3 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score: ");
        double score = input.nextDouble();

        if (score >= 60.0)
            System.out.println("D");

        else if (score >= 70.0)
            System.out.println("C");

        else if (score >= 80.0)
            System.out.println("B");

        else if (score >= 90.0)
            System.out.println("A");

        else
            System.out.println("F");
    }
}

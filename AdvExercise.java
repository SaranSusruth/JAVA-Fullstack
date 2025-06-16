import java.util.Scanner;

public class AdvExercise
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String again = "y";

        // Use a while loop to keep calculating while 'again' is 'y'
        while (again.equalsIgnoreCase("y"))
        {
            // Ask user for two numbers
            System.out.print("Enter first number: ");
            int a = input.nextInt();
            System.out.print("Enter second number: ");
            Double b = input.nextDouble();

            // Ask user for the operation (+, -, *, /)
            System.out.print("Choose operation (+, -, *, /): ");
            String op = input.next();

            // Use if-else to perform the operation
            if (op.equals("+"))
            {
                System.out.println("Result: " + (a + b));
            }
            else if (op.equals("-"))
            {
                System.out.println("Result: " + (a - b));
            }
            else if (op.equals("*"))
            {
                System.out.println("Result: " + (a * b));
            }
            else if (op.equals("/"))
            {
                // Handle division by zero case
                if (b == 0)
                {
                    System.out.println("Cannot divide by zero.");
                }
                else
                {
                    System.out.println("Result: " + (a / b));
                }
            }
            else
            {
                System.out.println("Invalid operation.");
            }

            // Ask if user wants to continue
            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();
        }
        System.out.println("Thank you for using the calculator.");
        input.close();
    }
}

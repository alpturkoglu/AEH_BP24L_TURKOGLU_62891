package pl.pp;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Choose operation:");
            System.out.println("a) add");
            System.out.println("b) subtract");
            System.out.println("c) multiply");
            System.out.println("d) divide");
            System.out.println("q) quit");

            choice = scanner.next().charAt(0);

            if (choice == 'q') {
                System.out.println("Exiting...");
                break;
            }

            if (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd') {
                System.out.println("Invalid choice, try again.");
                continue;
            }

            double num1, num2;

            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number:");
                scanner.next();
            }
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number:");
                scanner.next();
            }
            num2 = scanner.nextDouble();

            switch (choice) {
                case 'a':
                    System.out.printf("Result: %.2f\n", num1 + num2);
                    break;
                case 'b':
                    System.out.printf("Result: %.2f\n", num1 - num2);
                    break;
                case 'c':
                    System.out.printf("Result: %.2f\n", num1 * num2);
                    break;
                case 'd':
                    if (num2 != 0)
                        System.out.printf("Result: %.2f\n", num1 / num2);
                    else
                        System.out.println("Cannot divide by zero.");
                    break;
            }

        } while (true);

        scanner.close();
    }
}
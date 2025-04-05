package pl.pp;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter temperature in Celsius (-1 to quit): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Exiting program...");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsius: %.2f °C\n", celsius);
            System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
            System.out.printf("Kelvin: %.2f K\n", kelvin);
        }

        scanner.close();
    }
}
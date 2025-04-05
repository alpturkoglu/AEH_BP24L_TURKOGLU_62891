package pl.pp;

import java.util.Scanner;

public class AgeInSecondsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age in years:");
        int ageYears = scanner.nextInt();

        // Hesaplama
        long secondsInYear = 365L * 24 * 60 * 60;
        long ageInSeconds = ageYears * secondsInYear;

        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}
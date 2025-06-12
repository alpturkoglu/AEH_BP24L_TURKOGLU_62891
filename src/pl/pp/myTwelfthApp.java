package pl.pp;
import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = null;

        // Girdi dosyası yolu al ve kontrol et
        while (true) {
            System.out.print("Enter the path to the input file: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (inputFile.exists() && inputFile.isFile()) {
                break;
            } else {
                System.out.println("File does not exist. Please try again.");
            }
        }

        // Çıktı dosyası yolu al
        System.out.print("Enter the path to the output file: ");
        String outputPath = scanner.nextLine();
        File outputFile = new File(outputPath);

        int lineCount = 0;

        // Satır sayısını say
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }

            // Konsola yaz
            System.out.println("Number of lines in the file: " + lineCount);

            // Dosyaya yaz
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                writer.write("File: " + inputFile.getName() + "\n");
                writer.write("Number of lines: " + lineCount);
                System.out.println("Result written to: " + outputFile.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
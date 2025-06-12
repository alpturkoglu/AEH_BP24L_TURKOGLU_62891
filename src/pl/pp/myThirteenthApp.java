package pl.pp;
import java.io.*;
import java.util.*;

public class myThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = null;

        // Girdi dosyasını kullanıcıdan iste, kontrol et
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

        // Çıktı dosya yolu al
        System.out.print("Enter the path to the output file: ");
        String outputPath = scanner.nextLine();
        File outputFile = new File(outputPath);

        Map<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;

        // Girdi dosyasını oku ve kelime sayımı yap
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                        totalWords++;
                    }
                }
            }

            // Konsola yazdır
            System.out.println("Total words: " + totalWords);
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Dosyaya yaz
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                writer.write("File: " + inputFile.getName() + "\n");
                writer.write("Total words: " + totalWords + "\n");
                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                }
                System.out.println("Results written to: " + outputFile.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
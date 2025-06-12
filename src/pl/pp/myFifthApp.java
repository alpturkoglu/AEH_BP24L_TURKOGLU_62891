package pl.pp;
public class myFifthApp {

    // İteratif yöntemle faktöriyel hesaplayan metod
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Rekürsif yöntemle faktöriyel hesaplayan metod
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 20; // Hesaplanacak sayı

        // İteratif yöntemin zamanı
        long startTimeIter = System.nanoTime();
        long resultIter = factorialIterative(number);
        long endTimeIter = System.nanoTime();
        long durationIter = endTimeIter - startTimeIter;

        // Rekürsif yöntemin zamanı
        long startTimeRec = System.nanoTime();
        long resultRec = factorialRecursive(number);
        long endTimeRec = System.nanoTime();
        long durationRec = endTimeRec - startTimeRec;

        // Sonuçlar yazdırılıyor
        System.out.println("Number: " + number);
        System.out.println("Iterative factorial result: " + resultIter);
        System.out.println("Iterative execution time: " + durationIter + " nanoseconds");
        System.out.println("Recursive factorial result: " + resultRec);
        System.out.println("Recursive execution time: " + durationRec + " nanoseconds");
    }
}
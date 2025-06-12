package pl.pp;
import java.util.Arrays;

public class myTenthApp {

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result1 = countAndSumElements(input1);
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + Arrays.toString(result1));

        int[] input2 = {};
        int[] result2 = countAndSumElements(input2);
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output: " + Arrays.toString(result2));

        int[] input3 = null;
        int[] result3 = countAndSumElements(input3);
        System.out.println("Input: null");
        System.out.println("Output: " + Arrays.toString(result3));
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int negativeCount = 0;
        int positiveSum = 0;

        for (int number : input) {
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveSum += number;
            }
        }

        return new int[]{negativeCount, positiveSum};
    }
}

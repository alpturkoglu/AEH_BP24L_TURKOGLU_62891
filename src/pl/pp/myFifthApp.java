package pl.pp;

public class myFifthApp {
    public static void main(String[] args) {
        printChars('@', 3,1 );
    }

    public static void printChars(char character, int columns, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
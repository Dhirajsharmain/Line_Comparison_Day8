/**
 * Compilation:  javac -d bin Line_Comparison.java
 * Purpose: Use Java Object Oriented Programming Concepts of Line and Point as well as equals and compareTo methods.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 06-06-2021
 */

package bridgelabz;

public class LineComparison {
    public static double firstLineLength;
    public static double secondLineLength;

    /**
     * Method for calculating the length of line.
     */
    private static double calculatingLengthOfLine(int x1, int x2, int y1, int y2) {
        double lineLength;
        lineLength = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        return lineLength;
    }

    /**
     * Method for checking equality of two lines.
     */
    private static void compareLine() {
        String stringFirst = String.valueOf(firstLineLength);
        String stringSecond = String.valueOf(secondLineLength);
        int check = stringFirst.compareTo(stringSecond);
        if (check == 0) {
            System.out.println("Both Lines are equal");
        } else {
            if (check > 0) {
                System.out.println("First line is longer than second line");
            } else {
                System.out.println("Second line is longer than First line");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
        firstLineLength = calculatingLengthOfLine(3, 2, 6, 8);
        System.out.println(firstLineLength);
        secondLineLength = calculatingLengthOfLine(5, 3, 6, 2);
        System.out.println(secondLineLength);
        compareLine();
    }
}
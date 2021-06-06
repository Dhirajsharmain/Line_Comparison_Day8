/**
 * Compilation:  javac -d bin Line_Comparison.java
 * Purpose: Use Java Object Oriented Programming Concepts of Line and Point as well as equals and compareTo methods.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 06-06-2021
 */

package bridgelabz;

import java.util.Scanner;

class Line {
    Scanner scanner = new Scanner(System.in);
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();
    int a1 = scanner.nextInt();
    int b1 = scanner.nextInt();
    int a2 = scanner.nextInt();
    int b2 = scanner.nextInt();
    double firstLineLength, secondLineLength;

    /**
     * Method for calculating the length of lines.
     */
    public void calculatingLengthOfLine() {
        firstLineLength = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        secondLineLength = Math.sqrt(Math.pow(a2 - a1, 2) + (Math.pow(b2 - b1, 2)));
    }

    /**
     * Method for checking equality of two lines.
     */
    public void compareLine() {
        calculatingLengthOfLine();
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
}

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
        Line lineObject = new Line();
        lineObject.calculatingLengthOfLine();
        System.out.println(lineObject.firstLineLength);
        System.out.println(lineObject.secondLineLength);
        lineObject.compareLine();
    }
}
/**
 * Compilation:  javac -d bin Line_Comparison.java
 * Purpose: Use Java Object Oriented Programming Concepts of Line and Point as well as equals and compareTo methods.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 06-06-2021
 */

package bridgelabz;

class Line {
    int x1 = 3, x2 = 6, y1 = 8, y2 = 2;
    int a1 = 3, a2 = 6, b1 = 8, b2 = 2;
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
    public void checkingEqualityOfLine() {
        calculatingLengthOfLine();
        if (firstLineLength == secondLineLength) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
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
        lineObject.checkingEqualityOfLine();
    }
}

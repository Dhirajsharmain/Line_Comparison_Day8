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
    double lineLength;

    /**
     * Method for calculating the length of line.
     */
    public void calculatingLengthOfLine() {
        lineLength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
        Line lineObject = new Line();
        lineObject.calculatingLengthOfLine();
        System.out.println(lineObject.lineLength);
    }
}

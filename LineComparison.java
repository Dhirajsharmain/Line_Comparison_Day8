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
<<<<<<< HEAD
=======
    public static double lineLength;
>>>>>>> UC1-CalCulateLenthOfLine

    /**
     * This is the main method. it is the starting point of this program.
     * @param args
     */
<<<<<<< HEAD
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");

=======
    private static void calculatingLengthOfLine(int x1, int x2,int y1 , int y2 ) {
        lineLength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
        calculatingLengthOfLine(3,2,6,8);
        System.out.println(lineLength);
>>>>>>> UC1-CalCulateLenthOfLine
    }
}
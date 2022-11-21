/*
* This program generates every possible 3x3 Magic Square.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-11-21
*/

import java.util.Arrays;

/**
 * This is a Magic Square Finder.
 */

final class MagicSquare {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     *
     * @throws IllegalStateException
     *
     */
    private BinarySearch() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The middle left index.
     */
    public static final int THREE = 3;

    /**
     * The center index.
     */
    public static final int FOUR = 4;

    /**
     * The middle right index.
     */
    public static final int FIVE = 5;

    /**
     * The lower left index.
     */
    public static final int SIX = 6;

    /**
     * The lower center index.
     */
    public static final int SEVEN = 7;

    /**
     * The lower right index.
     */
    public static final int EIGHT = 8;

    /**
     * The maximum index of the array.
     */
    public static final int NINE = 9;

    /**
     * The expected sum of a row/column/diagonal.
     */
    public static final int MAGICNUM = 15;

    /**
     * Function that checks for duplicates in an array.
     *
     * @param sqrArray - array to be checked.
     * @return boolean
     */
    public static boolean hasDuplicates(final int[] sqrArray) {
        // aaa
    }

    /**
     * Function that generates every possible magic square.
     *
     * @param pNum - possible numbers to fill sqrArray with.
     * @param sqrArray - array to be filled and checked for "magic".
     * @param index - current index of sqrArray.
     */
    public static void genSquare(final int[] pNum, final int[] sqrArray,
                                 final int index) {
        // generate the magic square here.
    }

    /**
     * Function that checks if an array is "magic".
     *
     * @param preSquare - array to be checked.
     * @return boolean
     */
    public static boolean isMagic(final int[] preSquare) {
        // returns true or false for whether or not array is a magic square
        int row1 = preSquare[0] + preSquare[1] + preSquare[2];
        int row2 = preSquare[THREE] + preSquare[FOUR] + preSquare[FIVE];
        int row3 = preSquare[SIX] + preSquare[SEVEN] + preSquare[EIGHT];
        int col1 = preSquare[0] + preSquare[THREE] + preSquare[SIX];
        int col2 = preSquare[1] + preSquare[FOUR] + preSquare[SEVEN];
        int col3 = preSquare[2] + preSquare[FIVE] + preSquare[EIGHT];
        int diag1 = preSquare[0] + preSquare[FOUR] + preSquare[EIGHT];
        int diag2 = preSquare[2] + preSquare[FOUR] + preSquare[SIX];

        return row1 == row2 && row2 == row3 && row3 == col1 &&
            col1 == col2 && col2 == col3 && col3 == diag1 &&
            diag1 == diag2 && diag2 == MAGICNUM;
    }

    /**
     * Function that prints a magic square with an appropriate format.
     *
     * @param outputSquare - array to be printed.
     */
    public static void printMagicSquare(final int[] outputSquare) {
        // prints inputted array in a magic square format
        System.out.println("\n*****");
        for (int count = 0; count < outputSquare.length; count++) {
            if (count == THREE || count == SIX) {
                System.out.println();
                System.out.print(outputSquare[count] + " ");
            } else {
                System.out.print(outputSquare[count] + " ");
            }
        }
        System.out.println("\n*****");
    }

    public static void main(final String[] args) {
        int[] magicSquare = {1, 2, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};
        int[] extraArray = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("\n");
        System.out.println("All Possible Magic Squares (3x3):\n");
        genSquare(magicSquare, extraArray, 0);
    }
}

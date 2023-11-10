/*
* This program determines the run of a string.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-11-25
*/

import java.util.Scanner;

/**
* This program determines the run of a string.
*/
final class Run {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Run() {
        throw new IllegalStateException("Cannot be instantiated ");
    }

    /**
    * The run() function.
    *
    * @param arrayOfString the collection of letters
    * @param quantity the number of strings in the input
    * @return the run of the letters
    */
    public static int run(final String[] arrayOfString,
        final int quantity) {
        // Variables.
        int currentMaxCount = 0;
        int counterOne;
        int counterTwo;

        for (counterOne = 0; counterOne < quantity; ++counterOne) {
            int count = 0;
            for (counterTwo = 0; counterTwo < quantity; ++counterTwo) {
                /*
                * If the next value would be out of the array then
                * this if will be called
                */
                if (counterOne + counterTwo >= quantity) {
                    break;
                } else {
                    if (arrayOfString[counterOne].equals(
                        arrayOfString[counterOne + counterTwo])) {
                        ++count;
                    } else {
                        break;
                    }
                }
            }

            if (count > currentMaxCount) {
                currentMaxCount = count;
            }
        }
        final int run = currentMaxCount;
        return run;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Inputs.
        final Scanner myObjOne = new Scanner(System.in);
        System.out.println("Please enter some string to find the run from: ");
        final String text = myObjOne.nextLine();

        String[] arrayOfString = new String[text.length()];

        arrayOfString = text.split("");

        System.out.println("\nCalculating stats...");
        final int run = run(arrayOfString, text.length());

        System.out.println("The run is: " + run);

        System.out.println("\nDone.");
    }
}

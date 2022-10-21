package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        public static void oneMonthCalendar ( int days, int firstDay){
            int weekCount = firstDay - 1;

            for (int j = 1; j <= 3 * (firstDay - 1); j++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= days; i++) {
                System.out.printf("%2d", i);
                System.out.print(" ");
                weekCount++;

                if (weekCount == 7) {
                    System.out.println();
                    weekCount = 0;
                }
            }

            if (weekCount != 0) System.out.println();
        }
    }

    public static long[] lcg(long s) {
        int a = 1103515245;

        int c = 12345;

        long m = ((long) Math.pow(2, 31));

        long[] result = new long[10];

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                result[i] = (a * s + c) % m;
            } else {
                result[i] = (a * result[i-1] + c) % m;
            }
        }

        return result;
    }

    public static void guessingGame(int GuessNo) {

        int counter = 1;
        int guess;
        boolean state = false;
        Scanner input = new Scanner(System.in);

        while(state == false)
        {
            System.out.print("Guess number "+counter+": ");
            guess = input.nextInt();

            if(counter >= 10){
                System.out.println("You lose!");
                return;
            }

            if(guess > GuessNo) {
                System.out.println("The computer-picked number is lower than your guess.");
                counter++;
            }
            else if (guess < GuessNo ) {
                System.out.println("The computer-picked number is higher than your guess.");
                counter++;
            }
            else if(guess == GuessNo){
                System.out.println("Congrats!");
                state = true;
            }

        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        return (int) (Math.random()*100) + 1;
    }

    public static boolean swapArrays(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }

        for(int i=0; i<a.length; i++){
            int helper = a[i];
            a[i] = b[i];
            b[i] = helper;
        }

        return true;
    }

    public static String camelCase( String input )
    {
        final int ASCII_DIFFERENCE = 32;

        boolean isCapital = true;
        char[] inputAsChars = input.toCharArray();

        StringBuilder output = new StringBuilder();

        for( char letter : inputAsChars )
        {
            if( letter >= 'a' && letter <= 'z' )
            {
                if( isCapital )
                {
                    letter -= ASCII_DIFFERENCE;
                }
                output.append( letter );
                isCapital = false;
            }

            else if( letter >= 'A' && letter <= 'Z' )
            {
                if( !isCapital )
                {
                    letter += ASCII_DIFFERENCE;
                }
                output.append( letter );
                isCapital = false;
            }
            else if( letter == ' ' )
            {
                isCapital = true;
            }
        }
        return output.toString();
    }

    public static int checkDigit(int[] inputArray) {
        int prodSum=0;

        int checkDigit;

        for (int i = 0; i < inputArray.length; i++){
            prodSum += inputArray[i] * (i+2);
        }
        checkDigit = 11 - (prodSum % 11);
        if(checkDigit == 10) return 0;

        else if (checkDigit == 11) return 5;

        return checkDigit;
    }

    public static void main(String[] args) {
        System.out.println("Task 6: Check Digit");
        int[] inputArray = {3, 9, 1, 5, 8};
        System.out.println(App.checkDigit(inputArray));
    }
}



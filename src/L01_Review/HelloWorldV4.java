package L01_Review;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorldV4 {
    public static void main ( String[] args ) {
        System.out.println("Hello World");

        Scanner sc = new Scanner( System.in );

        // declare 'names' array
        String[] names = new String[10];

        // declare 'ages' array
        int[] ages = new int[10];

        // declare 'bonuses' array
        double[] bonuses = new double[10];

        boolean running = true;
        int index = 0;

        while( running ){
            // get user's name
            System.out.println("Please enter your name: ");
            String userName = sc.nextLine();

            // get user's age
            System.out.println("Please enter your age: ");
            int userAge = Integer.parseInt( sc.nextLine() );

            // calculate user's bonus
            double bonus = calculateDiscount( userAge );

            // store user's data in arrays
            names[index] = userName;
            ages[index] = userAge;
            bonuses[index] = bonus;

            System.out.println("Do you want to continue [y/n]: ");
            String answer = sc.nextLine();

            if(answer.equals( "n" )){
                running = false;
            }

            System.out.println("Done.");

            index = index + 1;
        }

        System.out.println( Arrays.toString(names));
        System.out.println( Arrays.toString(ages));
        System.out.println( Arrays.toString(bonuses));

        System.out.println("Goodbye!");
    }

    public static double calculateDiscount(int age){
        double bonus = 0.0;
        if ( age > 10 && age < 18 ){
            System.out.println("You receive 20% discount.");
            bonus = 0.2;
        } else if ( age >= 18 && age < 55 ) {
            System.out.println("No discount.");
        } else {
            System.out.println("You receive 100% discount.");
            bonus = 1;
        }

        return bonus;
    }
}
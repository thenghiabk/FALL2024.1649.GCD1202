package L01_Review;

import java.util.ArrayList;
import java.util.Scanner;


public class HelloWorldV6 {
    public static void main ( String[] args ) {
        System.out.println( "Hello World" );

        Scanner sc = new Scanner( System.in );

        // declare 'users' ArrayList
        ArrayList<User> users = new ArrayList<>();

        boolean running = true;

        while ( running ) {
            // get user's name
            System.out.println( "Please enter your name: " );
            String userName = sc.nextLine();

            // get user's age
            System.out.println( "Please enter your age: " );
            int userAge = Integer.parseInt( sc.nextLine() );

            // calculate user's bonus
            double bonus = calculateDiscount( userAge );

            // store user's data in 'users' ArrayList
            User newUser = new User( userName, userAge, bonus );
            users.add( newUser );

            System.out.println( "Do you want to continue [y/n]: " );
            String answer = sc.nextLine();

            if ( answer.equals( "n" ) ) {
                running = false;
            }

            System.out.println( "Done." );

        }

        // display all users' information in ArrayList
        for ( int i = 0; i < users.size(); i++ ) {
            System.out.println("User " + i + ": ");
            System.out.println(users.get(i));
        }


        System.out.println( "Goodbye!" );
    }

    public static double calculateDiscount ( int age ) {
        double bonus = 0.0;
        if ( age > 10 && age < 18 ) {
            System.out.println( "You receive 20% discount." );
            bonus = 0.2;
        } else if ( age >= 18 && age < 55 ) {
            System.out.println( "No discount." );
        } else {
            System.out.println( "You receive 100% discount." );
            bonus = 1;
        }

        return bonus;
    }
}
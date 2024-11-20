package L01_Review;

import java.util.Scanner;


public class HelloWorldV5 {
    public static void main ( String[] args ) {
        System.out.println( "Hello World" );

        Scanner sc = new Scanner( System.in );

        // declare 'users' array
        User[] users = new User[ 20 ];

        boolean running = true;
        int index = 0;

        while ( running ) {
            // get user's name
            System.out.println( "Please enter your name: " );
            String userName = sc.nextLine();

            // get user's age
            System.out.println( "Please enter your age: " );
            int userAge = Integer.parseInt( sc.nextLine() );

            // calculate user's bonus
            double bonus = calculateDiscount( userAge );

            // store user's data in 'users' array
            users[ index ] = new User( userName, userAge, bonus ); // TODO

            System.out.println( "Do you want to continue [y/n]: " );
            String answer = sc.nextLine();

            if ( answer.equals( "n" ) ) {
                running = false;
            }

            System.out.println( "Done." );

            index = index + 1;
        }

        // display all users' information
        for ( int i = 0; i < users.length; i++ ) {
            if(users[i] != null){
                System.out.println("User " + i + ": ");
                System.out.println(users[i]);
            }
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
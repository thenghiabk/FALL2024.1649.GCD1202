package L01_Review;

import java.util.Scanner;

public class HelloWorldV3 {
    public static void main ( String[] args ) {
        System.out.println("Hello World");

        Scanner sc = new Scanner( System.in );

        boolean running = true;

        while( running ){
            int userAge = askAge();
            calculateDiscount( userAge );

            System.out.println("Do you want to continue [y/n]: ");
            String answer = sc.nextLine();

            if(answer.equals( "n" )){
                running = false;
            }

            System.out.println("Done.");
        }

        System.out.println("Goodbye!");
    }

    public static int askAge(){
        Scanner sc = new Scanner( System.in );
        System.out.println("Please enter your age: ");
        String userInput = sc.nextLine();
        int userAge = Integer.parseInt( userInput );
        System.out.println("Your age: " + userAge);

        return userAge;
    }

    public static void calculateDiscount(int age){
        if ( age > 10 && age < 18 ){
            System.out.println("You receive 20% discount.");
        } else if ( age >= 18 && age < 55 ) {
            System.out.println("No discount.");
        } else {
            System.out.println("You receive 100% discount.");
        }
    }
}
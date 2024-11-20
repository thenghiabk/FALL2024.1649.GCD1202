package L01_Review;

import java.util.Scanner;

public class HelloWorldV0 {
    public static void main ( String[] args ) {
        System.out.println("Hello World");

        calculateDiscount();
        calculateDiscount();
        calculateDiscount();

        System.out.println("Goodbye!");
    }

    public static void calculateDiscount(){
        Scanner sc = new Scanner( System.in );
        System.out.println("Please enter your age: ");

        int age = Integer.parseInt( sc.nextLine() );
        System.out.println("Your age: " + age);

        if ( age > 18 ){
            System.out.println("No discount.");
        } else {
            System.out.println("You receive 20% discount.");
        }
    }
}
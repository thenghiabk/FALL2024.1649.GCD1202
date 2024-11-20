package L01_Review;

import java.util.Scanner;

public class HelloWorldV1 {
    public static void main ( String[] args ) {
        System.out.println("Hello World");

        int userAge = askAge();
        calculateDiscount( userAge );

        System.out.println("Goodbye!");
    }

    public static int askAge(){
        Scanner sc = new Scanner( System.in );
        System.out.println("Please enter your age: ");

        int age = Integer.parseInt( sc.nextLine() );
        System.out.println("Your age: " + age);

        return age;
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
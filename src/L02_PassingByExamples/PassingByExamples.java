package L02_PassingByExamples;

/*
    // more: https://www.softwaretestinghelp.com/java/java-pass-by-reference-and-pass-by-value/
 */

// This class demonstrates examples of passing by value and passing by reference in Java.
public class PassingByExamples {
    public static void main ( String[] args ) {

        // (1) pass-by-value demonstration
        System.out.println("pass-by-value demonstration");
        int x = 5;
        methodA(x);
        System.out.println("x = " + x); // (2) 5
        System.out.println(x); // (2) 5

        // (2) pass-by-reference demonstration
        System.out.println("pass-by-reference demonstration");
        int[] y = new int[3];
        y[0] = 55;
        y[1] = 65;
        y[2] = 75;

        methodB(y); // y[0] is updated to 95 within methodB

        System.out.println("y[] = ");
        for ( int i = 0; i < y.length; i++ ) {
            System.out.println(y[i]);
        } // prints out [96, 65, 75]

        // (2) pass-by-reference demonstration
        System.out.println("pass-by-reference demonstration");
        User u1 = new User( "John" );

        methodC( u1 ); // u1.name is updated to "Lucy" within methodC
        System.out.println(u1.name); // prints out "Lucy", not "John"
    }

    public static void methodC(User p){
        System.out.println(p.name);
        p.name = "Lucy"; // u1.name is updated to "Lucy" via p
    }

    public static void methodB(int[] numbers){
        System.out.println("numbers[] = ");
        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.println(numbers[i]);
        }

        numbers[0] = 95;
    }

    public static void methodA(int a){
        a = 10;
        System.out.println(a); // (1) 10
    }
}

class User {
    public String name;
    public User(String initialName){
        this.name = initialName;
    }
}

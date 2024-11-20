package L02_ArrayList;

import java.util.ArrayList;

public class BuiltInArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>( );

        // Add elements to the ArrayList
        numbers.add( 10 ); // 0
        numbers.add( 20 ); // 1
        numbers.add( 30 ); // 2

        // Access elements in the ArrayList
        int firstNumber = numbers.get( 0 );
        System.out.println( "First number: " + firstNumber );

        // Update an element in the ArrayList
        int previousNumber = numbers.set( 1, 25 );

        int secondNumber = numbers.get( 1 );
        System.out.println( "Second number: " + secondNumber );
        System.out.println( "Previous number at index 1: " + previousNumber );


        // Remove an element from the ArrayList
        int removedNumber = numbers.remove( 2 );
        System.out.println( "Removed number at index 2: " + removedNumber );

        // numbers = [10, 25]
        // Iterate over the elements in the ArrayList
                for (int i = 0; i < 2; i++) {
                    System.out.println( "Number at " + i + " : " + numbers.get(i));
                }

        for ( int number : numbers ) {
            System.out.println( "Number: " + number );
        }

        // Check if the ArrayList contains a specific element
        boolean containsTwenty = numbers.contains( 20 );
        System.out.println( "Contains 20? " + containsTwenty );


        // Get the size of the ArrayList
        int size = numbers.size( );
        System.out.println( "Size: " + size );


        // Clear all elements from the ArrayList
        numbers.clear( );

        // Check if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty( );
        System.out.println( "Is empty? " + isEmpty );

        // Create an ArrayList to store strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        for (String s : strings){
            System.out.println(s);
        }

        ArrayList<Student> studentList = new ArrayList<>( );
        studentList.add( new Student( "John" ) );
        studentList.add( new Student( "David" ) );
        studentList.add( new Student( "Lucy" ) );
        studentList.add( new Student( "Ben" ) );
        System.out.println( studentList );
    }
}

class Student {
    private String name;

    public Student( String name ) {
        this.name = name;
    }
    public String getName( ) {
        return name;
    }
    public void setName( String name ) {
        this.name = name;
    }

    @Override
    public String toString( ) {
        return name;
    }
}
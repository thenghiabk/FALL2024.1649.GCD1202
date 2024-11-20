package L02_ArrayList;

public class ArrayListADTRunner {
    public static void main ( String[] args ) {

        /* Integer ArrayList Example */

        ArrayListADT<Integer> myArrayList = new ArrayListADT<>();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);

        myArrayList.add(2, 70);
        //myArrayList.add(20, 80); // potential error

        System.out.println( myArrayList.toString() );

        // Get the size of the ArrayList
        int size = myArrayList.size( );
        System.out.println( "Size: " + size );

        int secondNumber = myArrayList.get( 1 );
        System.out.println( "Second number: " + secondNumber );

        // Update an element in the ArrayList
        //int previousNumber = myArrayList.set( 1, 25 );
        //System.out.println( "Previous number at index 1: " + previousNumber );

        // Remove an element from the ArrayList
        int removedNumber = myArrayList.remove( 1 );
        System.out.println( "Removed number at index 1: " + removedNumber );

        System.out.println( myArrayList );

        // Find a specific element
        int foundIndex = myArrayList.indexOf( 80 );
        System.out.println( "Found index: " + foundIndex );

        // Check if the ArrayList contains a specific element
        boolean containsTwenty = myArrayList.contains( 20 );
        System.out.println( "Contains 20? " + containsTwenty );

        // Check if the ArrayList is empty
        boolean isEmpty = myArrayList.isEmpty( );
        System.out.println( "Is empty? " + isEmpty );

        /* String ArrayList Example */
        ArrayListADT<String> myStringArrayListADT = new ArrayListADT<>();
        myStringArrayListADT.add( "Hello World" );
        myStringArrayListADT.add( "Goodbye" );
        System.out.println(myStringArrayListADT);

    }
}

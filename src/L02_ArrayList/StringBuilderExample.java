package L02_ArrayList;

public class StringBuilderExample {
    public static void main ( String[] args ) {
        // [10, 20, 30, 40, 50]

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append( 10 );
        sb.append( ", " );
        sb.append( 20 );
        sb.append( ", " );
        sb.append( 30 );
        sb.append( ", " );
        sb.append( 40 );
        sb.append( ", " );
        sb.append( 50 );
        sb.append("]");

        System.out.println(sb);


        String msg = "Hello ";
        msg += "John.";
        msg += "How are you?";

        System.out.println(msg); // Hello John. How are you?

    }
}

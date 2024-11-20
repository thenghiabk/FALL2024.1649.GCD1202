package L02_GenericClass;


class BoxInt{
    // attributes
    private int content;

    // constructor
    public BoxInt(int value){
        this.content = value;
    }

    // methods
    public int getContent(){
        return this.content;
    }
}

class BoxString{
    // attributes
    private String content;

    // constructor
    public BoxString(String value){
        this.content = value;
    }

    // methods
    public String getContent(){
        return this.content;
    }
}

class Box<E>{
    // attributes
    private E content;

    // constructor
    public Box(E value){
        this.content = value;
    }

    // methods
    public E getContent(){
        return this.content;
    }
}

public class GenericClassExample {
    public static void main ( String[] args ) {
        BoxInt b1 = new BoxInt( 1 );
        System.out.println(b1.getContent());

        BoxString b2 = new BoxString("Hello World");
        System.out.println(b2.getContent()); // Hello World

        Box<Integer> b3 = new Box<>( 2 );
        System.out.println(b3.getContent()); // 2

        Box<String> b4 = new Box<>( "Goodbye" );
        System.out.println(b4.getContent()); // Goodbye
    }
}

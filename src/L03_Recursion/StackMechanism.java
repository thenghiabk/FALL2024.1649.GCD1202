package L03_Recursion;

public class StackMechanism {
    public static void main ( String[] args ) {
        int n = 0;
        sayHello(n);
    }

    private static void sayHello(int n){
        System.out.println("Hello World");
        sayGoodbye(n+1);
    }

    private static void sayGoodbye(int n){
        System.out.println("Goodbye");
        if(n != 3){     // base case | base condition
            sayHello(n);
        }
    }

}

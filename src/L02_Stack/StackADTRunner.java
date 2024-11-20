package L02_Stack;

public class StackADTRunner {
    public static void main ( String[] args ) {
        StackADT<Integer> myIntStackADT = new StackADT<>();
        myIntStackADT.push(10);
        myIntStackADT.push(20);
        myIntStackADT.push(30);
        myIntStackADT.push(40);

        System.out.println(myIntStackADT);

        System.out.println(myIntStackADT.peek()); // 40

        System.out.println(myIntStackADT.pop()); // 40
        System.out.println(myIntStackADT.pop()); // 30

        System.out.println(myIntStackADT.peek()); // 20

        System.out.println(myIntStackADT.pop()); // 20
        System.out.println(myIntStackADT.pop()); // 10

        //System.out.println(myIntStackADT.pop()); // error

        //System.out.println(myIntStackADT.peek()); // error

        System.out.println(myIntStackADT.isEmpty()); // true


    }
}

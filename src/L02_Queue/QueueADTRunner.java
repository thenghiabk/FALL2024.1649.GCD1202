package L02_Queue;

public class QueueADTRunner {
    public static void main ( String[] args ) {
        QueueADT<Integer> myIntQueue = new QueueADT<>();
        myIntQueue.offer( 10 );
        myIntQueue.offer( 20 );
        myIntQueue.offer( 30 );
        myIntQueue.offer( 40 );

        System.out.println(myIntQueue); // [10, 20, 30, 40]


        System.out.println(myIntQueue.peek()); // 10

        System.out.println(myIntQueue.poll()); // 10


        System.out.println(myIntQueue.poll()); // 20
        System.out.println(myIntQueue.poll()); // 30

        System.out.println(myIntQueue.peek()); // 40

        System.out.println(myIntQueue.size()); // 1

        System.out.println(myIntQueue); // [40]
    }
}

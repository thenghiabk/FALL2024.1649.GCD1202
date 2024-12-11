package E02_BankingApp;

public class QueueADT<E> implements AbstractQueue<E> {
    // inner class Node for queue
    private class Node {

        // data fields
        private E element; // element of node
        private Node next; // pointer to next node

        // constructor with initial element
        public Node ( E initialElement ) {
            this.element = initialElement;
            this.next = null;
        }
    }

    // data fields
    private Node head; // pointer to first node
    private int size; // size of queue

    // constructor
    public QueueADT () {
        this.head = null;
        this.size = 0;
    }


    @Override
    public void offer ( E element ) {
        Node newNode = new Node( element ); // create new node

        if(this.head == null){
            this.head = newNode; // set head to new node
        } else {
            Node tempNode = this.head; // temp node to iterate through queue

            while(tempNode.next != null){
                tempNode = tempNode.next; // move to next node
            }

            tempNode.next = newNode; // add new node to end of queue
        }

        this.size++; // increment size
    }

    @Override
    public E poll () {

        // check if queue is empty
        if (this.head == null){
            throw new IllegalStateException("Queue is currently empty.");
        }

        E oldElement = this.head.element; // store element to be removed

        Node tempNode = this.head;
        this.head = this.head.next; // update head
        tempNode.next = null; // set temp node to null to avoid memory leak
        this.size--; // decrement size

        return oldElement;
    }

    @Override
    public E peek () {

        // check if queue is empty
        if (this.head == null){
            throw new IllegalStateException("Queue is currently empty.");
        }

        return this.head.element;
    }

    @Override
    public int size () {
        return this.size;
    }

    @Override
    public boolean isEmpty () {
        return this.head == null && this.size == 0;
    }

    @Override
    public String toString() { // returns a string representation of the queue elements
        StringBuilder sb = new StringBuilder(); // initialize string builder to build string
        sb.append( "[" );

        Node tempNode = this.head; // temp node to iterate through queue

        while(tempNode != null){
            sb.append( tempNode.element ); // add element to string
            if(tempNode.next != null){ // if next node is not null
                sb.append( ", " ); // add comma
            }
            tempNode = tempNode.next; // move to next node
        }

        sb.append( "]" );
        return sb.toString(); // return string representation of queue
    }
}

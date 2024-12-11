package E02_BankingApp;

// Stack ADT implementation using linked list structure
public class StackADT<E> implements AbstractStack<E> {

    // inner class Node for stack
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

    private Node top; // top of stack linked list structure pointer to first node
    private int size; // size of stack

    // constructor for stack ADT object initializing top and size
    public StackADT(){
        this.top = null; // stack is empty by default
        this.size = 0;
    }

    @Override
    public void push ( E element ) { // pushes an element onto the stack
        Node newNode = new Node( element );
        newNode.next = this.top;
        this.top = newNode;
        this.size++;
    }

    @Override
    public E pop () { // pops the top element from the stack

        // check if stack is empty
        if (this.top == null){
            throw new IllegalStateException("Stack is currently empty.");
        }

        E oldElement = this.top.element; // store removed element

        Node tempNode = this.top; // temp node to hold removed node
        this.top = this.top.next; // top is now the next node

        tempNode.next = null; // set temp node to null to avoid memory leak
        this.size--; // decrement size of stack

        return oldElement; // return removed element
    }

    @Override
    public E peek () { // peeks at the top element

        // check if stack is empty
        if(this.top == null){
            throw new IllegalStateException("Stack is currently empty.");
        }

        return this.top.element; // cast to E type to avoid compiler error
    }

    @Override
    public int size () { // gets the size of the stack
        return this.size;
    }

    @Override
    public boolean isEmpty () { // checks if the stack is empty
        if (this.top == null && this.size == 0){ // stack is empty if top is null and size is 0
            return true;
        }

        return false;
    }

    @Override
    public String toString() { // returns a string representation of the stack elements
        StringBuilder sb = new StringBuilder(); // initialize string builder to build string
        sb.append( "[" );

        Node tempNode = this.top; // temp node to iterate through stack

        while(tempNode != null){
            sb.append( tempNode.element ); // add element to string
            if(tempNode.next != null){ // if next node is not null
                sb.append( ", " ); // add comma
            }
            tempNode = tempNode.next; // move to next node
        }

        sb.append( "]" );
        return sb.toString(); // return string representation of stack
    }
}

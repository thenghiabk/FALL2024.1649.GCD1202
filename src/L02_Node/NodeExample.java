package L02_Node;

public class NodeExample {
    public static void main ( String[] args ) {
        Node n0 = new Node();
        n0.element = 10;

        Node n1 = new Node();
        n1.element = 20;

        n0.next = n1; // links n1 to n0

        Node n2 = new Node();
        n2.element = 30;

        n1.next = n2; // links n2 to n1

        System.out.println(n0.next.element); // 20 ~ n1.element

        n0.next.next.element = 50; // n2.element is now 50
        System.out.println(n2.element); // 50

        Node n3 = new Node();
        n3.element = 60;

        n3.next = n1; // links n1 to n3
        n0.next = n3; // links n3 to n0

        System.out.println(n0.next.next.element);
    }
}

class Node{
    public int element;
    public Node next;
}

package E02_BankingApp;

public interface AbstractQueue<E> {
    void offer( E element );
    E poll( );
    E peek( );
    int size( );
    boolean isEmpty( );
}

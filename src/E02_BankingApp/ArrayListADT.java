package E02_BankingApp;

import java.util.Arrays;

public class ArrayListADT<E> implements AbstractArrayList<E> {
    // data fields
    private E[] elements;
    private int size;

    // constructor
    public ArrayListADT(){
        this.elements = (E[]) new Object[4];
        this.size = 0;
    }

    // methods
    @Override
    public boolean add ( E element ) {
        if(this.size == this.elements.length){
            E[] newElements = Arrays.copyOf( this.elements, this.elements.length * 2 );
            this.elements = newElements;
        }

        this.elements[this.size] = element;
        this.size = this.size + 1;
        return true;
    }

    @Override
    public boolean add ( int index, E element ) {

        // validate index
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index "
                    + index + " out of bounds: " + this.size);
        }

        if(this.size == this.elements.length){
            E[] newElements = Arrays.copyOf( this.elements, this.elements.length * 2 );
            this.elements = newElements;
        }

        // shift remaining elements to the right
        for ( int i = this.size; i >= index ; i-- ) {
            this.elements[i] = this.elements[ i - 1 ];
        }

        this.elements[index] = element; // update new element at index
        this.size = this.size + 1;
        return true;
    }

    @Override
    public E get ( int index ) {
        // validate index
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index "
                    + index + " out of bounds: " + this.size);
        }

        return this.elements[index] ;
    }

    @Override
    public E set ( int index, E element ) {
        // validate index
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index "
                    + index + " out of bounds: " + this.size);
        }

        E oldElement = this.elements[index];
        this.elements[index] = element;
        return oldElement;
    }

    @Override
    public E remove ( int index ) {
        // validate index
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index "
                    + index + " out of bounds: " + this.size);
        }

        E oldElement = this.elements[index];

        // shift remaining elements to the left
        for ( int i = index; i < size-1; i++ ) {
            this.elements[i] = this.elements[i+1];
        }

        this.size--;
        this.elements[this.size] = null;

        return oldElement;
    }

    @Override
    public int size () {
        return this.size;
    }

    @Override
    public int indexOf ( E element ) {

        for ( int i = 0; i < size; i++ ) {
            if (this.elements[i] == element){
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean contains ( E element ) {

        for ( int i = 0; i < size; i++ ) {
            if (this.elements[i] == element){
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isEmpty () {
        // Option 1
        if (this.size == 0){
            return true;
        }

        return false;

        // Option 2
        //return this.size == 0;
    }

    @Override
    public String toString () {

        StringBuilder sb = new StringBuilder();
        sb.append( "[" );

        for ( int i = 0; i < this.size; i++ ) {
            sb.append( this.elements[i] );
            if (i < this.size - 1){
                sb.append( ", " );
            }
        }

        sb.append( "]" );

        return sb.toString();
    }
}

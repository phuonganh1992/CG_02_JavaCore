
import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    public static final int DEFAULT_CAPACITY=10;
    private Object[] elements;

    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity>0){
            elements=new Object[capacity];
        } else if (capacity==0){
            elements=new Object[]{};
        } else throw new IllegalArgumentException("Illegal capacity: "+capacity);
    }
    public void add(int index,E element){
        if (index<0 || index>size) throw new IndexOutOfBoundsException("Index is out of range");
        else {
            if(size==elements.length){
                elements=Arrays.copyOf(elements,size+1);
            }
            for (int i = size; i >index ; i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
    public E remove(int index){
        if (index<0 || index>=size) throw new IndexOutOfBoundsException("Index is out of range");
        E oldValue=(E) elements[index];
        for (int i = index; i <size-1 ; i++) {
                elements[i] = elements[i + 1];
        }
        elements[size-1]=null;
        size--;
        return oldValue;
    }
    public int size(){

        return size;
    }
    public E[] clone(){
        return (E[]) elements;
    }
    public boolean contains(E o){
        boolean isContains=false;
        for (int i = 0; i < size; i++) {
            if(elements[i]==o){
                isContains=true;
            }
        }
        return isContains;
    }
    public int indexOf(E o){
        int index=-1;
        for (int i=0; i < size; i++) {
            if(elements[i]==o) {
                index=i;
                break;
            }
        }
        return index;
    }
    public boolean add(E e){
        return true;
    }
    public void ensureCapacity(int minCapacity){
        if(minCapacity>size) elements=Arrays.copyOf(elements,minCapacity);
    }
    public E get(int i){
        if(i<0 || i>=size){
            throw new IndexOutOfBoundsException("Index "+i+" is out of size");
        }
        return (E) elements[i];
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i]=null;
        }
        size=0;
    }
}

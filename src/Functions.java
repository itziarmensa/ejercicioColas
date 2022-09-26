

public class Functions<E> implements Queue<E>{

    E[] elements;
    int p;

    public void push(E e) throws FullQueueException{
        if(isFull())
            throw new FullQueueException("La cola está llena");
        elements[p++] = e;
    }

    private boolean isFull() {
        return size() > p;
    }

    public E pop() throws EmptyQueueException{
        if(isEmpty())
            throw new EmptyQueueException("La cola está vacía");
        E primer = elements[0];
        this.p--;
        return primer;
    }
    public int size(){
        return this.p;
    }
    private boolean isEmpty() {
        return size() == 0;
    }

}

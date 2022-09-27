public class Functions<E> implements Queue<E>{
    E[] elements;
    int p;
    public Functions(int l){
        this.elements=(E[]) new Object[l];
        this.p=0;
    }
    private boolean isFull() {
        if(this.size()==elements.length){
            return true;
        }
        else{
            return false;}
        }
    private boolean isEmpty() {
        return size() == 0;
    }
    public int size(){
        return this.p;
    }
    public void push(E e) throws FullQueueException {
        if (isFull())
            throw new FullQueueException("La cola está llena");
        else {
            elements[p] = e;
            p++;
        }
    }
    public E pop() throws EmptyQueueException{
        if(isEmpty())
            throw new EmptyQueueException("La cola está vacía");
        E primer = elements[0];
        this.p--;
        return primer;
    }

}

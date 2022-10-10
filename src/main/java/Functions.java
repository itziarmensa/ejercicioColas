
public class Functions<E> implements Queue<E>{
    E[] elements;
    E[] elementsPop;
    int p;
    public Functions(int l){
        this.elements=(E[]) new Object[l];
        this.elementsPop=(E[]) new Object[l];
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
        for(int i=1;i<=p;i++){
            this.elementsPop[i-1]=this.elements[i];
        }
        this.p--;
        for(int i=0;i<=p;i++){
            this.elements[i]=this.elementsPop[i];
        }
        return primer;
    }

}

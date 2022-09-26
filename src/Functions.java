
import java.util.Queue;

public abstract class Functions implements Queue{

    private double max;

    public void push(Object e) throws FullQueueException{
        if(size() == max - 1)
            throw new FullQueueException("La cola está llena");
        add(e);
    }
    public Object pop() throws EmptyQueueException{
        if(size() == 0)
            throw new EmptyQueueException("La cola está vacía");
        return remove();
    }
    public int size(){
        return size();
    }

}

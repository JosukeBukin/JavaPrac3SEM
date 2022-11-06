package Java23;

public abstract class AbstractQueue {
    int size;
    public abstract boolean isEmpty();
    public abstract void enqueue(int n);
    public abstract int dequeue();
}

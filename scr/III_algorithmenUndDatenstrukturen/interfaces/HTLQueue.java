package III_algorithmenUndDatenstrukturen.interfaces;

public interface HTLQueue {
    void enqueue(int i);

    int dequeue() throws NullPointerException;

    void printQueue();
}

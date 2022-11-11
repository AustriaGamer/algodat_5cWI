package III_algorithmenUndDatenstrukturen.classes.queue;

import III_algorithmenUndDatenstrukturen.interfaces.HTLQueue;

public class THLQueue implements HTLQueue {
    private HTLItem first;
    private HTLItem last;
    @Override
    public void enqueue(int i) {
        HTLItem item = new HTLItem(i,null,last);
        if (first == null){
            first = item;
        }
        last = item;
    }

    @Override
    public int dequeue() throws NullPointerException {
        return 0;
    }

    @Override
    public void printQueue() {

    }
}

package III_algorithmenUndDatenstrukturen.classes.queue;

import III_algorithmenUndDatenstrukturen.classes.stack.HTLStackScreen;

public class HTLItem {
    public HTLItem(int value, HTLItem previous, HTLItem next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
    private final int value;
    private final HTLItem previous;

    private HTLItem next;

    public HTLItem getPrevious() {
        return previous;
    }

    public int getValue() {
        return value;
    }

    public HTLItem getNext() {
        return next;
    }
    public void setNext(HTLItem i) {
        next = i;
    }
}

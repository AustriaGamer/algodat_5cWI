package III_algorithmenUndDatenstrukturen.classes.queue;

public class HTLItem {
    public HTLItem(int value) {
        this.value = value;
        this.next = null;
    }
    private final int value;

    private HTLItem next;

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

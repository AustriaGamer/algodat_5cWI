package III_algorithmenUndDatenstrukturen.classes.queue;

public class HTLQueue implements III_algorithmenUndDatenstrukturen.interfaces.HTLQueue {
    private HTLItem first;
    private HTLItem last;
    @Override
    public void enqueue(int i) {
        HTLItem item = new HTLItem(i);
        if (first == null){
            first = item;
            last = item;
            return;
        }
        last.setNext(item);
        last=item;
    }

    @Override
    public int dequeue() throws NullPointerException {
        int res = first.getValue();
        first = first.getNext();
        return res;
    }

    @Override
    public void printQueue() {
        HTLItem item = first;
        System.out.print("{");
        while (item.getNext() != null){
            System.out.print(item.getValue() + ", ");
            item = item.getNext();
        }
        System.out.print(item.getValue() + "}");
    }
}

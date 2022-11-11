package III_algorithmenUndDatenstrukturen.interfaces;

public interface HTLStack {
    public void push(int i);

    public int peak();

    public int pop() throws NullPointerException;

    public void printStack();
}

package III_algorithmenUndDatenstrukturen.interfaces;

public interface HTLStack {
    void push(int i);

    int peek();

    int pop() throws NullPointerException;

    void printStack();
}

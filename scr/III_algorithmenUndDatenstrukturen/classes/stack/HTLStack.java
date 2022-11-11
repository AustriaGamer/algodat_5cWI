package III_algorithmenUndDatenstrukturen.classes.stack;

public class HTLStack implements III_algorithmenUndDatenstrukturen.interfaces.HTLStack {
    private HTLStackScreen top;

    @Override
    public void push(int i) {
        top = new HTLStackScreen(i, top);
    }

    @Override
    public int peak() throws NullPointerException{
        return top.value();
    }

    @Override
    public int pop() throws NullPointerException{
        int res = peak();
        top = top.previous();
        return res;
    }

    @Override
    public void printStack() {
        HTLStackScreen screen = top;
        System.out.print("{");
        while (screen.previous() != null){
            System.out.print(screen.value() + ", ");
            screen = screen.previous();
        }
        System.out.print(screen.value() + "}");
    }
}

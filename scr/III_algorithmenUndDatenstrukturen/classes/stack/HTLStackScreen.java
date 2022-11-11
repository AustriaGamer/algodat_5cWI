package III_algorithmenUndDatenstrukturen.classes.stack;

public class HTLStackScreen {
    public HTLStackScreen(int value, HTLStackScreen previous) {
        this.value = value;
        this.previous = previous;
    }
    private final int value;
    private final HTLStackScreen previous;

    public HTLStackScreen getPrevious() {
        return previous;
    }

    public int getValue() {
        return value;
    }
}

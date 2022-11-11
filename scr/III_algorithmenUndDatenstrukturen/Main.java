package III_algorithmenUndDatenstrukturen;

import III_algorithmenUndDatenstrukturen.classes.HTLinkedList;

public class Main {
    public static void main(String[] args) {
        HTLinkedList ll = new HTLinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.remove(3);
        System.out.println(ll.get(2));
        ll.printList();
    }
}

package III_algorithmenUndDatenstrukturen;

import III_algorithmenUndDatenstrukturen.classes.list.HTLinkedList;
import III_algorithmenUndDatenstrukturen.classes.stack.HTLStack;
import III_algorithmenUndDatenstrukturen.interfaces.HTLQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "l" -> {
                HTLinkedList ll = new HTLinkedList();
                ll.add(4);
                ll.add(5);
                ll.add(6);
                ll.add(7);
                ll.add(8);
                ll.add(9);
                ll.remove(0);
                System.out.println(ll.get(2));
                ll.printList();
            }
            case "s" -> {
                HTLStack stack = new HTLStack();
                stack.push(4);
                stack.push(5);
                stack.push(6);
                stack.push(7);
                stack.push(8);
                stack.push(9);
                for (int i = 0; i < 11; i++) {
                    System.out.println(stack.pop());
                }
                System.out.println(stack.peek());
                stack.printStack();
            }
            case "q" -> {
                HTLQueue queue = new III_algorithmenUndDatenstrukturen.classes.queue.HTLQueue();
                queue.enqueue(4);
                queue.enqueue(5);
                queue.enqueue(6);
                queue.enqueue(7);
                queue.enqueue(8);
                queue.enqueue(9);
                System.out.println(queue.dequeue());
                queue.printQueue();
            }
            default -> System.out.println("Wrong input");
        }

    }
}

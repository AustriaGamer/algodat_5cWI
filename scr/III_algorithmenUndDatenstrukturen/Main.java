package III_algorithmenUndDatenstrukturen;

import III_algorithmenUndDatenstrukturen.classes.list.HTLinkedList;
import III_algorithmenUndDatenstrukturen.classes.stack.HTLStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "l":
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
                break;
            case "s":
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
                System.out.println(stack.peak());
                stack.printStack();
                break;
            case "q":
                break;
            default:
                System.out.println("Wrong input");
        }

    }
}

package III_algorithmenUndDatenstrukturen.classes.list;

import III_algorithmenUndDatenstrukturen.interfaces.HTList;

public class HTLinkedList implements HTList {
    private Node root;
    @Override
    public void add(int value) {
        Node n = new Node(value);
        if(root==null){
            root = n;
        }else{
            Node actual = root;
            while(actual.getNext()!=null){
                actual= actual.getNext();
            }
            actual.setNext(n);
        }
    }

    @Override
    public int get(int index) {
        Node actual = root;
        for (int i =0; i<index;i++){
            actual = actual.getNext();
        }
        return actual.getValue();
    }

    @Override
    public void remove(int index) {
        Node actual = root;
        if (index == 0){
            root = root.getNext();
            return;
        }
        for (int i =0; i<index-1;i++){
            actual = actual.getNext();
        }
        actual.setNext(actual.getNext().getNext());
    }

    @Override
    public void printList() {
        Node actual = root;
        System.out.print("{");
        while (actual.getNext() != null){
            System.out.print(actual.getValue() +", ");
            actual=actual.getNext();
        }
        System.out.print(actual.getValue()+ "}");
    }
}

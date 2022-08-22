package br.com.emersonmendes.study.datastructure;

public class ManualLinkedList {

    static Node head;

    public static Node addStart(Node root, int d) {
        Node node = new Node(d);
        node.next = root;
        return node;
    }

    public static Node addLast(Node root, int d) {

        Node node = root;

        while ((root.next != null)) {
            root = root.next;
        }

        root.next = new Node(d);

        return node;

    }

    public static void printList(Node node) {
        while (node != null){
            System.out.printf("%s ",node.data);
            node = node.next;
        }
    }

    public static Node reverse(Node node) {
        Node current = node;
        Node next;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        public boolean hasNext() {
            return next != null;
        }

    }

}

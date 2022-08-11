package br.com.emersonmendes.study.datastructure;

public class ManualLinkedList {

    static Node head;

    public void printList(Node node) {
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public Node reverse(Node node) {
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

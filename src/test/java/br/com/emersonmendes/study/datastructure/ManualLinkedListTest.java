package br.com.emersonmendes.study.datastructure;

import br.com.emersonmendes.study.datastructure.ManualLinkedList.Node;
import org.junit.jupiter.api.Test;

class ManualLinkedListTest {

    @Test
    void shouldPrintLinkedList() {

        ManualLinkedList mll = new ManualLinkedList();

        mll.head = new Node(69);

        mll.head.next = new Node(67);

        mll.head.next.next = new Node(2);

        mll.head.next.next.next = new Node(20);

        ManualLinkedList.printList(mll.head);

        System.out.println();
        mll.head = ManualLinkedList.reverse(mll.head);

        ManualLinkedList.printList(mll.head);

    }

    @Test
    void shouldInsertIntoEndLinkedList() {
        Node root = new Node(2);
        root = ManualLinkedList.addLast(root, 1);
        root = ManualLinkedList.addLast(root, 12);
        ManualLinkedList.printList(root);
    }

    @Test
    void shouldInsertIntoBeginningLinkedList() {
        Node root = new Node(1);
        root = ManualLinkedList.addStart(root, 10);
        root = ManualLinkedList.addStart(root, 130);
        ManualLinkedList.printList(root);
    }

}
package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.Test;

class ManualLinkedListTest {

    @Test
    void name() {

        ManualLinkedList mll = new ManualLinkedList();

        mll.head = new ManualLinkedList.Node(69);

        mll.head.next = new ManualLinkedList.Node(67);

        mll.head.next.next = new ManualLinkedList.Node(2);

        mll.head.next.next.next = new ManualLinkedList.Node(20);

        mll.printList(mll.head);

        System.out.println("-----------------------");
        mll.head = mll.reverse(mll.head);

        mll.printList(mll.head);

    }

}
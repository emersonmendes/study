package br.com.emersonmendes.study.datastructure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTest {

    private final PrintStream standardOut = System.out;

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void shouldPrintPreOrder() {
        Tree tree = buildTree();
        ByteArrayOutputStream outputStreamCaptor;

        // Function call
        System.out.println("\nPreorder traversal of binary tree is ");
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        tree.printPreorder(tree.root);
        assertEquals("25 15 10 4 12 22 18 24 50 35 31 44 70 66 90", outputStreamCaptor.toString().trim(),"Preorder test");

        System.out.println("\nInOrder traversal of binary tree is ");
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        tree.printInOrder(tree.root);
        assertEquals("4 10 12 15 18 22 24 25 31 35 44 50 66 70 90", outputStreamCaptor.toString().trim(),"InOrder test");

        System.out.println("\nPostOrder traversal of binary tree is ");
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        tree.printPostOrder(tree.root);
        assertEquals("4 12 10 18 24 22 15 31 44 35 66 90 70 50 25", outputStreamCaptor.toString().trim(),"PostOrder test");
    }

    private static Tree buildTree() {
        Tree tree = new Tree();
        tree.root = new Tree.Node(25);
        tree.root.left = new Tree.Node(15);
        tree.root.left.left = new Tree.Node(10);
        tree.root.left.right = new Tree.Node(22);
        tree.root.left.left.left = new Tree.Node(4);
        tree.root.left.left.right = new Tree.Node(12);
        tree.root.left.right.right = new Tree.Node(24);
        tree.root.left.right.left = new Tree.Node(18);
        tree.root.right = new Tree.Node(50);
        tree.root.right.left = new Tree.Node(35);
        tree.root.right.right = new Tree.Node(70);
        tree.root.right.right.right = new Tree.Node(90);
        tree.root.right.right.left = new Tree.Node(66);
        tree.root.right.left.right = new Tree.Node(44);
        tree.root.right.left.left = new Tree.Node(31);
        return tree;
    }

    @Test
    void shouldPrintInOrder() {

    }

    @Test
    void shouldPrintPostOrder() {

    }

}
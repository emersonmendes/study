package br.com.emersonmendes.study.datastructure;

import br.com.emersonmendes.study.datastructure.BinaryTree.Node;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void any() {
        Node rootNode = Node.of(1);
        BinaryTree.insert(rootNode, 2);
        BinaryTree.insert(rootNode, 3);
        BinaryTree.insert(rootNode, 4);
        BinaryTree.insert(rootNode, 5);
        BinaryTree.insert(rootNode, 6);
        BinaryTree.printLeafNodes(rootNode);
    }

    @Test
    public void shouldCheckBalancedBinaryTree() {

        Node rootNode = Node.of(100);
        BinaryTree.insert(rootNode, 20);
        BinaryTree.insert(rootNode, 150);
        BinaryTree.insert(rootNode, 120);
        BinaryTree.insert(rootNode, 250);

        BinaryTree.printLeafNodes(rootNode);
        boolean balanced1 = BinaryTree.isBalanced(rootNode);
        Assertions.assertThat(balanced1).isTrue();

        BinaryTree.insert(rootNode, 110);
        BinaryTree.insert(rootNode, 160);

        BinaryTree.printLeafNodes(rootNode);
        boolean balanced2 = BinaryTree.isBalanced(rootNode);
        Assertions.assertThat(balanced2).isFalse();

    }

    @Test
    public void shouldPrintZigZagTraversal() {

        Node rootNode = Node.of(1);
        Node threeNode = Node.of(3);
        threeNode.setLeft(Node.of(5));
        threeNode.setRight(Node.of(4));
        Node twoNode = Node.of(2);
        twoNode.setLeft(Node.of(7));
        twoNode.setRight(Node.of(6));
        rootNode.setLeft(twoNode);
        rootNode.setRight(threeNode);

        BinaryTree.printZigZagTraversal(rootNode);

    }

    @Test
    public void shouldGetMaxValue() {
        Node rootNode = Node.of(9000);
        BinaryTree.insert(rootNode, 190);
        BinaryTree.insert(rootNode, 40);
        BinaryTree.insert(rootNode, 400);
        BinaryTree.insert(rootNode, 500);
        BinaryTree.insert(rootNode, 3);
        BinaryTree.insert(rootNode, 10000);
        BinaryTree.insert(rootNode, 1900);
        BinaryTree.insert(rootNode, 1200);
        Assertions.assertThat(BinaryTree.searchMaxValue(rootNode)).isEqualTo(10000);
    }

    @Test
    public void shouldGetMinValue() {
        Node rootNode = Node.of(9000);
        BinaryTree.insert(rootNode, 190);
        BinaryTree.insert(rootNode, 40);
        BinaryTree.insert(rootNode, 400);
        BinaryTree.insert(rootNode, 500);
        BinaryTree.insert(rootNode, 3);
        BinaryTree.insert(rootNode, 10000);
        BinaryTree.insert(rootNode, 1900);
        BinaryTree.insert(rootNode, 1200);
        Assertions.assertThat(BinaryTree.searchMinValue(rootNode)).isEqualTo(3);
    }

    @Test
    public void shouldSearchABST() {

        Node rootNode = Node.of(3, Node.of(2, Node.of(1), Node.of(4)), Node.of(5) );

        Node foundNode = BinaryTree.search(rootNode, 2);
        Assertions.assertThat(foundNode).isNotNull();
        Assertions.assertThat(foundNode.getData()).isEqualTo(2);
        Assertions.assertThat(foundNode.getRight().getData()).isEqualTo(4);
        Assertions.assertThat(foundNode.getLeft().getData()).isEqualTo(1);

    }

    @Test
    public void shouldCheckInsertBST() {

        Node rootNode = Node.of(300);
        BinaryTree.insert(rootNode, 190);
        BinaryTree.insert(rootNode, 500);
        BinaryTree.insert(rootNode, 20);
        BinaryTree.insert(rootNode, 543);
        BinaryTree.insert(rootNode, 2);
        BinaryTree.insert(rootNode, 191);

        Assertions.assertThat(rootNode.getData()).isEqualTo(300);
        Assertions.assertThat(rootNode.getLeft().getData()).isEqualTo(190);
        Assertions.assertThat(rootNode.getRight().getData()).isEqualTo(500);
        Assertions.assertThat(rootNode.getLeft().getLeft().getData()).isEqualTo(20);
        Assertions.assertThat(rootNode.getLeft().getLeft().getData()).isEqualTo(20);
        Assertions.assertThat(rootNode.getRight().getRight().getData()).isEqualTo(543);
        Assertions.assertThat(rootNode.getLeft().getLeft().getLeft().getData()).isEqualTo(2);
        Assertions.assertThat(rootNode.getLeft().getRight().getData()).isEqualTo(191);

    }

    @Test
    public void shouldCheckBST() {

        Node rootNode = Node.of(30);

        BinaryTree.insert(rootNode, 20);
        BinaryTree.insert(rootNode, 50);
        BinaryTree.insert(rootNode, 10);
        BinaryTree.insert(rootNode, 40);
        BinaryTree.insert(rootNode, 60);
        BinaryTree.insert(rootNode, 70);
        BinaryTree.insert(rootNode, 80);
        BinaryTree.insert(rootNode, 21);

        Assertions.assertThat(BinaryTree.isBST(rootNode)).isTrue();

        BinaryTree.printLeafNodes(rootNode);

    }

    @Test
    public void shouldInvertBST() {

        Node root = BinaryTree.insert(null, 20);
        BinaryTree.insert(root, 15);
        BinaryTree.insert(root, 45);
        BinaryTree.insert(root, 7);
        BinaryTree.insert(root, 16);
        BinaryTree.insert(root, 21);
        BinaryTree.insert(root, 46);

        BinaryTree.printLeafNodes(root);

        BinaryTree.invert(root);
        Assertions.assertThat(root.getData()).isEqualTo(20);
        Assertions.assertThat(root.getLeft().getData()).isEqualTo(45);
        Assertions.assertThat(root.getRight().getData()).isEqualTo(15);
        Assertions.assertThat(root.getLeft().getLeft().getData()).isEqualTo(46);
        Assertions.assertThat(root.getLeft().getRight().getData()).isEqualTo(21);
        Assertions.assertThat(root.getRight().getLeft().getData()).isEqualTo(16);
        Assertions.assertThat(root.getRight().getRight().getData()).isEqualTo(7);

        BinaryTree.printLeafNodes(root);

    }


}

package br.com.emersonmendes.study.datastructure;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void shouldPrintZigZagTraversal() {

        BTNode rootNode = BTNode.of(1);
        BTNode threeNode = BTNode.of(3);
        threeNode.setLeft(BTNode.of(5));
        threeNode.setRight(BTNode.of(4));
        BTNode twoNode = BTNode.of(2);
        twoNode.setLeft(BTNode.of(7));
        twoNode.setRight(BTNode.of(6));
        rootNode.setLeft(twoNode);
        rootNode.setRight(threeNode);

        BinaryTree.printZigZagTraversal(rootNode);

    }

    @Test
    public void shouldGetMaxValue() {
        BTNode rootNode = BTNode.of(9000);
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
        BTNode rootNode = BTNode.of(9000);
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

        BTNode rootNode = BTNode.of(3, BTNode.of(2, BTNode.of(1), BTNode.of(4)), BTNode.of(5) );

        BTNode foundNode = BinaryTree.search(rootNode, 2);
        Assertions.assertThat(foundNode).isNotNull();
        Assertions.assertThat(foundNode.getKey()).isEqualTo(2);
        Assertions.assertThat(foundNode.getRight().getKey()).isEqualTo(4);
        Assertions.assertThat(foundNode.getLeft().getKey()).isEqualTo(1);

    }

    @Test
    public void shouldCheckInsertBST() {

        BTNode rootNode = BTNode.of(300);
        BinaryTree.insert(rootNode, 190);
        BinaryTree.insert(rootNode, 500);
        BinaryTree.insert(rootNode, 20);
        BinaryTree.insert(rootNode, 543);
        BinaryTree.insert(rootNode, 2);
        BinaryTree.insert(rootNode, 191);

        Assertions.assertThat(rootNode.getKey()).isEqualTo(300);
        Assertions.assertThat(rootNode.getLeft().getKey()).isEqualTo(190);
        Assertions.assertThat(rootNode.getRight().getKey()).isEqualTo(500);
        Assertions.assertThat(rootNode.getLeft().getLeft().getKey()).isEqualTo(20);
        Assertions.assertThat(rootNode.getLeft().getLeft().getKey()).isEqualTo(20);
        Assertions.assertThat(rootNode.getRight().getRight().getKey()).isEqualTo(543);
        Assertions.assertThat(rootNode.getLeft().getLeft().getLeft().getKey()).isEqualTo(2);
        Assertions.assertThat(rootNode.getLeft().getRight().getKey()).isEqualTo(191);

    }

    @Test
    public void shouldCheckBST() {

        BTNode rootNode = BTNode.of(3);
        BTNode twoNode = BTNode.of(2);
        rootNode.setLeft(twoNode);
        twoNode.setLeft(BTNode.of(1));
        BTNode fourNode = BTNode.of(4);
        twoNode.setRight(fourNode);

        rootNode.setRight(BTNode.of(5));

        Assertions.assertThat(BinaryTree.isBST(rootNode)).isTrue();

        fourNode.setLeft(BTNode.of(5));
        fourNode.setRight(BTNode.of(7));

        Assertions.assertThat(BinaryTree.isBST(rootNode)).isFalse();

    }

}

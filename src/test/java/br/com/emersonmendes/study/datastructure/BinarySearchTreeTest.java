package br.com.emersonmendes.study.datastructure;

import br.com.emersonmendes.study.datastructures.BinarySearchTree;
import br.com.emersonmendes.study.entity.Node;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void shouldGetMaxValue() {
        Node rootNode = Node.of(9000);
        BinarySearchTree.insert(rootNode, 190);
        BinarySearchTree.insert(rootNode, 40);
        BinarySearchTree.insert(rootNode, 400);
        BinarySearchTree.insert(rootNode, 500);
        BinarySearchTree.insert(rootNode, 3);
        BinarySearchTree.insert(rootNode, 10000);
        BinarySearchTree.insert(rootNode, 1900);
        BinarySearchTree.insert(rootNode, 1200);
        Assertions.assertThat(BinarySearchTree.searchMaxValue(rootNode)).isEqualTo(10000);
    }

    @Test
    public void shouldGetMinValue() {
        Node rootNode = Node.of(9000);
        BinarySearchTree.insert(rootNode, 190);
        BinarySearchTree.insert(rootNode, 40);
        BinarySearchTree.insert(rootNode, 400);
        BinarySearchTree.insert(rootNode, 500);
        BinarySearchTree.insert(rootNode, 3);
        BinarySearchTree.insert(rootNode, 10000);
        BinarySearchTree.insert(rootNode, 1900);
        BinarySearchTree.insert(rootNode, 1200);
        Assertions.assertThat(BinarySearchTree.searchMinValue(rootNode)).isEqualTo(3);
    }

    @Test
    public void shouldSearchABST() {

        Node rootNode = Node.of(3, Node.of(2, Node.of(1), Node.of(4)),Node.of(5) );

        Node foundNode = BinarySearchTree.search(rootNode, 2);
        Assertions.assertThat(foundNode).isNotNull();
        Assertions.assertThat(foundNode.getKey()).isEqualTo(2);
        Assertions.assertThat(foundNode.getRight().getKey()).isEqualTo(4);
        Assertions.assertThat(foundNode.getLeft().getKey()).isEqualTo(1);

    }

    @Test
    public void shouldCheckInsertBST() {
        Node rootNode = Node.of(300);
        BinarySearchTree.insert(rootNode, 190);

        Assertions.assertThat(rootNode.getLeft().getKey()).isEqualTo(190);
        Assertions.assertThat(rootNode.getRight()).isNull();

        BinarySearchTree.insert(rootNode, 500);
        Assertions.assertThat(rootNode.getRight().getKey()).isEqualTo(500);

        BinarySearchTree.insert(rootNode, 20);
        BinarySearchTree.insert(rootNode, 543);

        Assertions.assertThat(rootNode.getLeft().getKey()).isEqualTo(190);
        Assertions.assertThat(rootNode.getLeft().getLeft().getKey()).isEqualTo(20);
        Assertions.assertThat(rootNode.getRight().getKey()).isEqualTo(500);
        Assertions.assertThat(rootNode.getRight().getRight().getKey()).isEqualTo(543);

        BinarySearchTree.insert(rootNode, 543);

        Assertions.assertThat(rootNode.getRight().getRight().getKey()).isEqualTo(543);

        BinarySearchTree.insert(rootNode, 2);

        Assertions.assertThat(rootNode.getLeft().getLeft().getLeft().getKey()).isEqualTo(2);

        BinarySearchTree.insert(rootNode, 191);

        Assertions.assertThat(rootNode.getLeft().getRight().getKey()).isEqualTo(191);


    }

    @Test
    public void shouldCheckBST() {

        Node rootNode = Node.of(3);
        Node twoNode = Node.of(2);
        rootNode.setLeft(twoNode);
        twoNode.setLeft(Node.of(1));
        Node fourNode = Node.of(4);
        twoNode.setRight(fourNode);

        rootNode.setRight(Node.of(5));

        Assertions.assertThat(BinarySearchTree.isBST(rootNode)).isTrue();

        fourNode.setLeft(Node.of(5));
        fourNode.setRight(Node.of(7));

        Assertions.assertThat(BinarySearchTree.isBST(rootNode)).isFalse();

    }

}

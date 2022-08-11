package br.com.emersonmendes.study.datastructures;


import br.com.emersonmendes.study.entity.Node;

public class BinarySearchTree {

    public BinarySearchTree() {
    }

    public static Node insert(Node root, int key){

        if(root == null){
            return Node.of(key);
        }

        int rootKey = root.getKey();

        if(key > rootKey){
            //add right
            Node rightNode = insert(root.getRight(), key);
            root.setRight(rightNode);
        } else if (key < rootKey){
            //add left
            Node leftNode = insert(root.getLeft(), key);
            root.setLeft(leftNode);
        }

        return root;

    }

    public static Node search(Node root, int key){

        // Base Cases: root is null or key is present at root
        if (root == null || root.getKey() == key) {
            return root;
        }

        // Key is greater than root's key
        if (root.getKey() < key) {
            return search(root.getRight(), key);
        }

        // Key is smaller than root's key
        return search(root.getLeft(), key);

    }

    public static boolean isBST(Node node){

        if(node == null){
            return true;
        }

        Node left = node.getLeft();
        Node right = node.getRight();
        int key = node.getKey();

        if(left != null && left.getKey() > key){
            return false;
        }

        if(right != null && right.getKey() < key){
            return false;
        }

        if (!isBST(left) || !isBST(right)){
            return false;
        }

        return true;

    }


}

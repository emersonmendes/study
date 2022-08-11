package br.com.emersonmendes.study.datastructure;


import java.util.Objects;

class BinarySearchTree {

    public BinarySearchTree() {
    }

    public static BSTNode insert(BSTNode root, int key){

        if(root == null){
            return BSTNode.of(key);
        }

        int rootKey = root.getKey();

        if(key > rootKey){
            //add right
            BSTNode rightNode = insert(root.getRight(), key);
            root.setRight(rightNode);
        } else if (key < rootKey){
            //add left
            BSTNode leftNode = insert(root.getLeft(), key);
            root.setLeft(leftNode);
        }

        return root;

    }

    public static int searchMinValue(BSTNode root){
        Objects.requireNonNull(root,"Root should not be null");
        BSTNode currentNode = root;
        while (currentNode.getLeft() != null){
            currentNode = currentNode.getLeft();
        }
        return currentNode.getKey();
    }

    public static int searchMaxValue(BSTNode root){
        Objects.requireNonNull(root,"Root should not be null");
        BSTNode currentNode = root;
        while (currentNode.getRight() != null){
            currentNode = currentNode.getRight();
        }
        return currentNode.getKey();
    }

    public static BSTNode search(BSTNode root, int key){

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

    public static boolean isBST(BSTNode node){

        if(node == null){
            return true;
        }

        BSTNode left = node.getLeft();
        BSTNode right = node.getRight();
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

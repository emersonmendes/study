package br.com.emersonmendes.study.datastructure;


import java.util.Objects;
import java.util.Stack;

class BinarySearchTree {

    public BinarySearchTree() {
    }

    public static BTNode insert(BTNode root, int key){

        if(root == null){
            return BTNode.of(key);
        }

        int rootKey = root.getKey();

        if(key > rootKey){
            //add right
            BTNode rightNode = insert(root.getRight(), key);
            root.setRight(rightNode);
        } else if (key < rootKey){
            //add left
            BTNode leftNode = insert(root.getLeft(), key);
            root.setLeft(leftNode);
        }

        return root;

    }

    public static int searchMinValue(BTNode root){
        Objects.requireNonNull(root,"Root should not be null");
        BTNode currentNode = root;
        while (currentNode.getLeft() != null){
            currentNode = currentNode.getLeft();
        }
        return currentNode.getKey();
    }

    public static int searchMaxValue(BTNode root){
        Objects.requireNonNull(root,"Root should not be null");
        BTNode currentNode = root;
        while (currentNode.getRight() != null){
            currentNode = currentNode.getRight();
        }
        return currentNode.getKey();
    }

    public static BTNode search(BTNode root, int key){

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

    public static boolean isBST(BTNode node){

        if(node == null){
            return true;
        }

        BTNode left = node.getLeft();
        BTNode right = node.getRight();
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


    public static void printZigZagTraversal(BTNode rootNode) {

        if(rootNode == null){
            return;
        }

        Stack<BTNode> currentLevel = new Stack<>();
        Stack<BTNode> nextLevel = new Stack<>();

        currentLevel.push(rootNode);

        boolean leftToRight = true;

        while (!currentLevel.isEmpty()) {

            // pop out of stack
            BTNode node = currentLevel.pop();

            // print the data in it
            System.out.print(node.getKey() + " ");

            if (leftToRight) {
                if (node.getLeft() != null) {
                    nextLevel.push(node.getLeft());
                }
                if (node.getRight() != null) {
                    nextLevel.push(node.getRight());
                }
            } else {
                if (node.getRight() != null) {
                    nextLevel.push(node.getRight());
                }
                if (node.getLeft() != null) {
                    nextLevel.push(node.getLeft());
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<BTNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }

        }

    }

}

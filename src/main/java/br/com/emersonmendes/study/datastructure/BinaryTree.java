package br.com.emersonmendes.study.datastructure;


import java.util.*;

class BinaryTree {

    public BinaryTree() {}

    public static Node insert(Node root, int data){

        if(root == null){
            return Node.of(data);
        }

        int rootKey = root.getData();

        if(data > rootKey){
            //add right
            Node rightNode = insert(root.getRight(), data);
            root.setRight(rightNode);
        } else if (data < rootKey){
            //add left
            Node leftNode = insert(root.getLeft(), data);
            root.setLeft(leftNode);
        }

        return root;

    }

    public static int searchMinValue(Node root){
        Objects.requireNonNull(root,"Root should not be null");
        Node currentNode = root;
        while (currentNode.getLeft() != null){
            currentNode = currentNode.getLeft();
        }
        return currentNode.getData();
    }

    public static int searchMaxValue(Node root){
        Objects.requireNonNull(root,"Root should not be null");
        Node currentNode = root;
        while (currentNode.getRight() != null){
            currentNode = currentNode.getRight();
        }
        return currentNode.getData();
    }

    public static Node search(Node root, int data){

        // Base Cases: root is null or data is present at root
        if (root == null || root.getData() == data) {
            return root;
        }

        // Data is greater than root's data
        if (root.getData() < data) {
            return search(root.getRight(), data);
        }

        // Data is smaller than root's data
        return search(root.getLeft(), data);

    }

    public static boolean isBST(Node node){

        if(node == null){
            return true;
        }

        Node left = node.getLeft();
        Node right = node.getRight();
        int data = node.getData();

        if(left != null && left.getData() > data){
            return false;
        }

        if(right != null && right.getData() < data){
            return false;
        }

        if (!isBST(left) || !isBST(right)){
            return false;
        }

        return true;

    }


    public static void printZigZagTraversal(Node rootNode) {

        if(rootNode == null){
            return;
        }

        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        currentLevel.push(rootNode);

        boolean leftToRight = true;

        while (!currentLevel.isEmpty()) {

            // pop out of stack
            Node node = currentLevel.pop();

            // print the data in it
            System.out.print(node.getData() + " ");

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
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }

        }

    }

    public static Node invert(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root.getLeft();
        root.setLeft(invert(root.getRight()));
        root.setRight(invert(temp));
        return root;
    }

    public static void printLeafNodes(Node root) {
        printNodeInternal(Collections.singletonList(root), 1, maxLevel(root));
    }

    private static void printNodeInternal(List<Node> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes)) {
            return;
        }

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);

        List<Node> newNodes = new ArrayList<>();
        for (Node node : nodes) {
            if (node != null) {
                System.out.print(node.getData());
                newNodes.add(node.getLeft());
                newNodes.add(node.getRight());
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }
            printWhitespaces(betweenSpaces);
        }
        System.out.println();

        for (int i = 1; i <= edgeLines; i++) {
            for (Node node : nodes) {
                printWhitespaces(firstSpaces - i);
                if (node == null) {
                    printWhitespaces(edgeLines + edgeLines + i + 1);
                    continue;
                }
                if (node.getLeft() != null) {
                    System.out.print(" /");
                } else {
                    printWhitespaces(1);
                }
                printWhitespaces(i + i - 1);
                if (node.getRight() != null) {
                    System.out.print("\\");
                } else {
                    printWhitespaces(1);
                }
                printWhitespaces(edgeLines + edgeLines - i);
            }
            System.out.println();
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static int maxLevel(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(maxLevel(node.getLeft()), maxLevel(node.getRight())) + 1;
    }

    private static boolean isAllElementsNull(List list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }
        return true;
    }

    static class Node {

        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node of(int data){
            return new Node(data);
        }

        public static Node of(int data, Node left, Node right){
            Node node = new Node(data);
            node.setLeft(left);
            node.setRight(right);
            return node;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

    }

}

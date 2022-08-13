package br.com.emersonmendes.study.datastructure;


import java.util.*;

class BinaryTree {

    public BinaryTree() {
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

    public static BTNode invert(BTNode root) {
        if (root == null) {
            return null;
        }
        BTNode temp = root.getLeft();
        root.setLeft(invert(root.getRight()));
        root.setRight(invert(temp));
        return root;
    }

    public static void printLeafNodes(BTNode root) {
        printNodeInternal(Collections.singletonList(root), 1, maxLevel(root));
    }

    private static void printNodeInternal(List<BTNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes)) {
            return;
        }

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);

        List<BTNode> newNodes = new ArrayList<>();
        for (BTNode node : nodes) {
            if (node != null) {
                System.out.print(node.getKey());
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
            for (BTNode node : nodes) {
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

    private static int maxLevel(BTNode node) {
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

}

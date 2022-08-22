package br.com.emersonmendes.study.datastructure;


import java.util.*;

class BinaryTree {

    public BinaryTree() {}

    public static Node insert(Node node, int data){

        if(node == null){
            return Node.of(data);
        }

        int rootData = node.getData();

        if(data > rootData){
            node.setRight(insert(node.getRight(), data));
        } else if (data < rootData){
            node.setLeft(insert(node.getLeft(), data));
        }

        return node;

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

    static class NodeWrapper {

        Node node;
        int level;

        private NodeWrapper(Node node, int level) {
            this.node = node;
            this.level = level;
        }

        static NodeWrapper of(Node node, int level){
            return new NodeWrapper(node, level);
        }

    }

    public static void printTopViewWrapper(Node root) {

        Map<Integer, Integer> nodeValuesMap = new TreeMap<>();
        Queue<NodeWrapper> queue = new LinkedList<>();

        queue.add(NodeWrapper.of(root, 0));

        while(!queue.isEmpty()){

            NodeWrapper nodeWrapper = queue.poll();
            Node node = nodeWrapper.node;
            int level = nodeWrapper.level;

            if(!nodeValuesMap.containsKey(level)){
                nodeValuesMap.put(level, node.data);
            }

            if(node.left != null){
                queue.add(NodeWrapper.of(node.left, level - 1));
            }

            if(node.right != null){
                queue.add(NodeWrapper.of(node.right, level + 1));
            }

        }

        for (Integer value : nodeValuesMap.values()) {
            System.out.print(value + " ");
        }

    }

    public static void printTopView(Node root) {

        Map<Integer, Integer> vLevels = new HashMap<>();

        Map<Integer, Integer> nodeValuesMap = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();

        vLevels.put(root.data, 0);
        queue.add(root);

        while(!queue.isEmpty()){

            Node node = queue.poll();

            Integer nodeLevel = vLevels.get(node.data);
            if(!nodeValuesMap.containsKey(nodeLevel)){
                nodeValuesMap.put(nodeLevel, node.data);
            }

            if(node.left != null){
                queue.add(node.left);
                vLevels.put(node.left.data, nodeLevel - 1);
            }

            if(node.right != null){
                queue.add(node.right);
                vLevels.put(node.right.data, nodeLevel + 1 );
            }

        }

        for (Integer value : nodeValuesMap.values()) {
            System.out.print(value + " ");
        }

    }

    private static List<Node> searchKeepParent(int v, Node root) {

        List<Node> result = new ArrayList<>();

        while(true){

            result.add(root);

            Node left = root.left;
            Node right = root.right;

            if(v < root.data){
                root = left;
            } else if (v > root.data){
                root = right;
            } else {
                return result;
            }

        }

    }

    public static Node getLowestCommonAncestor(Node root, int v1, int v2){
        List<Node> v1List = searchKeepParent(v1, root);
        List<Node> v2List = searchKeepParent(v2, root);
        return v1List.stream().filter(v2List::contains).reduce((f, s) -> s ).orElse(root);
    }

    public static String printLevelOrderTraversal(Node root){

        List<Integer> numbers = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            Node node = queue.poll();
            numbers.add(node.data);

            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null){
                queue.add(node.right);
            }

        }

        StringBuilder result = new StringBuilder();

        for(Integer number: numbers){
            result.append(" ").append(number);
        }

        System.out.print(result);

        return result.toString();

    }

    public static void printZigZagTraversal(Node root) {

        if(root == null){
            return;
        }

        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        currentLevel.push(root);

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

    private static boolean isAllElementsNull(List<?> list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasAnyChild(Node node) {
        if(node == null){
            return false;
        }
        return node.getLeft() != null || node.getRight() != null;
    }

    public static boolean isBalanced(Node rootNode) {
        Height height = new Height();
        return isBalanced(rootNode, height);
    }

    public static boolean isBalanced(Node rootNode, Height height) {

        if(rootNode == null){
            height.value = 0;
            return true;
        }

        Height leftHeight = new Height();
        Height rightHeight = new Height();

        boolean leftIsBalanced = isBalanced(rootNode.getLeft(), leftHeight);
        boolean rightIsBalanced = isBalanced(rootNode.getRight(), rightHeight);

        height.value = Math.max(leftHeight.value, rightHeight.value) + 1;

        if(
            leftHeight.value - rightHeight.value >= 2 ||
            rightHeight.value - leftHeight.value >= 2
        ){
            return false;
        }

        return leftIsBalanced && rightIsBalanced;

    }

    static class Height {
        int value = 0;
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

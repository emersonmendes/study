package br.com.emersonmendes.study.algo;

import java.util.Scanner;

public class BinaryTreeHeight {

    private static Node add(Node root, int number){
        if(root == null){
            return new Node(number);
        }
        if(number > root.getNumber()){
            root.setRight(add(root.getRight(), number));
        } else {
            root.setLeft(add(root.getLeft(), number));
        }
        return root;
    }

    private static int getHeight(Node node){
        if(node == null){
            return -1;
        }
        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            Node root = null;
            for(var i = 0; i < n; i++){
                int number = scanner.nextInt();
                root = add(root, number);
            }
            System.out.println(getHeight(root));
        }
    }
}

class Node {
    public Node (int number){
        this. number = number;
    }
    private Node left;
    private Node right;
    private int number;
    private Node parent;
    public Node getLeft(){
        return left;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public Node getRight(){
        return right;
    }
    public void setRight(Node right){
        this.right = right;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public Node getParent(){
        return parent;
    }

    public void setParent(Node parent){
        this.parent = parent;
    }

}

package br.com.emersonmendes.study.entity;

public class Node {

    private int key;

    private Node left;

    private Node right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public static Node of(int key){
        return new Node(key);
    }

    public static Node of(int key, Node left, Node right){
        Node node = new Node(key);
        node.setLeft(left);
        node.setRight(right);
        return node;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
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

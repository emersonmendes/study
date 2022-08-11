package br.com.emersonmendes.study.datastructure;

public class BSTNode {

    private int key;

    private BSTNode left;

    private BSTNode right;

    public BSTNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public static BSTNode of(int key){
        return new BSTNode(key);
    }

    public static BSTNode of(int key, BSTNode left, BSTNode right){
        BSTNode node = new BSTNode(key);
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

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

}

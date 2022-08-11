package br.com.emersonmendes.study.datastructure;

public class BTNode {

    private int key;

    private BTNode left;

    private BTNode right;

    public BTNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public static BTNode of(int key){
        return new BTNode(key);
    }

    public static BTNode of(int key, BTNode left, BTNode right){
        BTNode node = new BTNode(key);
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

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

}

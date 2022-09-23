package br.com.emersonmendes.study.datastructure;


class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    void printPreorder(Node node){

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");

        printPreorder(node.left);
        printPreorder(node.right);

    }

    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    static class Node {

        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

}

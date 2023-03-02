package Tree;

public class Tree {
    public static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
            this.left = this.right = null;

        }

        }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
    }


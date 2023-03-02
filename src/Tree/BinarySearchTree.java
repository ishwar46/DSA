package Tree;

public class BinarySearchTree {
    public static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){ //constructor
            this.data = data; //assigning data to node
            this.left = this.right = null; //initially left and right child are null

        }

        }
    public static Node createBST(Node root, int data) { //method to create a BST
        if (root == null) {  //if tree is empty
            return new Node(data);      //create a new node
        }

        if (data < root.data) {   //if data is less than root
            root.left = createBST(root.left, data);  //create a new node in left subtree
        } else if (data > root.data) {  //if data is greater than root
            root.right = createBST(root.right, data); //create a new node in right subtree
        }
        return root;
    }

    public static void main(String[] args) {    //main method
        Node root = null;
        root = createBST(root, 10); //calling createBST method
        root = createBST(root, 20);
        root = createBST(root, 30);
        root = createBST(root, 40);
        root = createBST(root, 50);
        root = createBST(root, 25);
    }





}

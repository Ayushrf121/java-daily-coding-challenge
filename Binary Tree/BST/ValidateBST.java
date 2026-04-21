public class ValidateBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node bst(Node root, int data) {
        Node currNode = new Node(data);
        if (root == null) {
            root = currNode;
            System.out.println("The root node : " + root.data);
            return root;
        }
        if (currNode.data < root.data) {
            root.left = bst(root.left, data);
        } else if (currNode.data > root.data) {
            root.right = bst(root.right, data);
        } else {
            System.out.println("Duplicates are not allowed");
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}

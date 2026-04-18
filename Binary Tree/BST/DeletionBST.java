public class DeletionBST {

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

    public static Node funcIS(Node root,int val){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return root;
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2 One Child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            // case 3 Both children
                // inorder successor = leftmost node of the right subtree.
                Node is = funcIS(root.right,val);
                root.data = is.data;
                root.right = delete(root.right,is.data);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        root = bst(root, 4);
        root = bst(root, 3);
        root = bst(root, 1);
        root = bst(root, 6);
        root = bst(root, 5);
        root = bst(root, 8);
        root = bst(root, 10);
        root = bst(root, 11);
        root = bst(root, 12);
        root = bst(root, 14);
        inOrder(root);
        System.out.println();
        delete(root, 5);
        inOrder(root);
    }
}

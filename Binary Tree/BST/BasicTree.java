
public class BasicTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node bst(Node root,int data){
        Node currNode = new Node(data);
        if(root==null){
            root = currNode;
            System.out.println("The root node : "+root.data);
            return root;
        }
        if(currNode.data<root.data){
            root.left = bst(root.left, data);
        }else if(currNode.data>root.data){
            root.right = bst(root.right, data);
        }
        else{
            System.out.println("Duplicates are not allowed");
        }
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root = null;
        root=bst(root, 4);
        root=bst(root, 3);
        root=bst(root, 2);
        root=bst(root, 1);
        root=bst(root, 6);
        root=bst(root, 5);
        if(root==null){
            System.out.println("Tree is Empty");
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
}
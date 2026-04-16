
public class BSTSearch {
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
    public static int bstSearch(Node root,int key){
        if(root==null){
            return -1;
        }
        if(root.data == key){
            return root.data;
        }
        int res=-1;
        if(key<root.data){
            res=bstSearch(root.left, key);
        }else if(key>root.data){
            res=bstSearch(root.right, key);
        }
        return res;
    }
    public static void main(String[] args) {
        Node root = null;
        root=bst(root, 4);
        root=bst(root, 3);
        root=bst(root, 2);
        root=bst(root, 1);
        root=bst(root, 6);
        root=bst(root, 5);
        System.out.println("The key is existing with a value : "+bstSearch(root, 3));
    }   
}

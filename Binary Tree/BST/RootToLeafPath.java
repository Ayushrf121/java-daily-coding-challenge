import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {

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
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> li = new ArrayList<>();
    public static void givePath(Node root){
        if(root==null){
            return;
        }
        li.add(root.data);
        if(root.left!=null || root.right!=null){
            givePath(root.left);
            givePath(root.right);
            li.remove(li.size()-1);
        }else{
            res.add(new ArrayList<>(li));
            li.remove(li.size()-1);
        }
    }
    public static List<List<Integer>> leafPath(Node root){
        if(root==null){
            return res;
        }
        givePath(root);
        return res;
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
        System.out.println(leafPath(root));
    }
}
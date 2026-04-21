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
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null&&root.data<=min.data){
            return false;
        }
        if(max!=null&&root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, root)&& isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        Node root = null;
        int values[] = {1,1,1};
        for (int i = 0; i < values.length; i++) {
            root = bst(root, values[i]);
        }
        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("invalid");
        }
    }
}
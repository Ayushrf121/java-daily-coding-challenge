import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Merge2BST {
    
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
    public static void getInorder(Node root,ArrayList<Integer>li){
        if(root==null){
            return;
        }
        getInorder(root.left, li);
        li.add(root.data);
        getInorder(root.right, li);
        return;
    }
    public static Node getMergedBST(ArrayList<Integer>li,int low,int high){
        if(low>high){
            return null;
        }
        int mid = low+(high-low)/2;
        Node currNode = new Node(li.get(mid));
         currNode.left = getMergedBST(li, low, mid-1);
         currNode.right = getMergedBST(li, mid+1,high);
         return currNode;
    }
    public static Node mergedBST(Node root1,Node root2){
        // if(root1==null){
        //     return root2;
        // }else if(root2==null){
        //     return root1;
        // }
        // ArrayList<Integer> li1 = new ArrayList<>();
        // getInorder(root1,li1);
        // ArrayList<Integer> li2 = new ArrayList<>();
        // getInorder(root2,li2);
        ArrayList<Integer> li1 = new ArrayList<>();
        getInorder(root1,li1);
        getInorder(root2,li1);
        Collections.sort(li1);
        return getMergedBST(li1,0,li1.size()-1);
        
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
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node root3 = null;
        root3 = mergedBST(root1, root2);
        inOrder(root3);
    }
}

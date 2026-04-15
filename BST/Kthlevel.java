import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Kthlevel{
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
    public static ArrayList<Integer> kthLevel(Node root,int k){
        ArrayList<Integer>li =new ArrayList<>();
        if(k<1){
            return li;
        }
        if(k==1){
            li.add(root.data);
            return li;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int i=1;
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode==null){
                i++;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(i==k){
                    li.add(currNode.data);
                }
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        return li;
    }
    public static ArrayList<Integer> kthLevelRecursion(Node root,int k,int level){
        ArrayList<Integer>li =new ArrayList<>();
        if(root==null){
            return li;
        }
        if(level==k){
            li.add(root.data);
            return li;
        }
        ArrayList<Integer> left = kthLevelRecursion(root.left, k, level+1);
        ArrayList<Integer> right = kthLevelRecursion(root.right, k, level+1);
        li.addAll(left);
        li.addAll(right);
        return li;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ArrayList<Integer>li = new ArrayList<>();
        ArrayList<Integer>li2 = new ArrayList<>();
        li = kthLevel(root, 3);
        li2 = kthLevelRecursion(root,3,1);
        System.out.println(li);
        System.out.println(li2);
    }
}
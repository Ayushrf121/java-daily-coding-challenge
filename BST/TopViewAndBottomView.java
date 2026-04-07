import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewAndBottomView {
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
    static class Info {
        Node node;
        int hd;
        Info(Node node,int hd){
            this.hd=hd;
            this.node=node;
        }
    }   
    public static void topViewOfTree(Node root){
        if(root==null){
            return;
        }
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map = new HashMap<>();
        // we created a new obj of Info class.
        q.add(new Info(root, 0));
        q.add(null);
        int min=0,max=0;
        while (!q.isEmpty()) {
            Info temp = q.remove();
            if(temp==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                // map having key or not.
                if(!map.containsKey(temp.hd)){
                    map.put(temp.hd, temp.node);
                }
                if(temp.node.left!=null){
                    q.add(new Info(temp.node.left,temp.hd-1));
                    min = Math.min(min, temp.hd-1);
                }
                if(temp.node.right!=null){
                    q.add(new Info(temp.node.right,temp.hd+1));
                    max = Math.max(max, temp.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void bottomViewOfTree(Node root){
        if(root==null){
            return;
        }
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map = new HashMap<>();
        // we created a new obj of Info class.
        q.add(new Info(root, 0));
        q.add(null);
        int min=0,max=0;
        while (!q.isEmpty()) {
            Info temp = q.remove();
            if(temp==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                // overwriting the existing keys.
                map.put(temp.hd, temp.node);
                
                if(temp.node.left!=null){
                    q.add(new Info(temp.node.left,temp.hd-1));
                    min = Math.min(min, temp.hd-1);
                }
                if(temp.node.right!=null){
                    q.add(new Info(temp.node.right,temp.hd+1));
                    max = Math.max(max, temp.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);    
        topViewOfTree(root);
    }
}
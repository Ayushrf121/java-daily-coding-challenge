import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class HeightOfTree {
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
    static class BinaryTree{
        static int i=-1;
        public Node buildTree(int nodes[]){
            i++;
            if(nodes[i]==-1){
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public int height(Node rt){
            if(rt==null){
                return 0;
            }
            int ht=0;
            int left = height(rt.left);
            int right = height(rt.right);
            ht=Math.max(left, right)+1;
            return ht;
        }
        
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj = new BinaryTree();
        Node root = obj.buildTree(nodes);
        System.out.println("The height of the Tree : "+obj.height(root));
    }
}
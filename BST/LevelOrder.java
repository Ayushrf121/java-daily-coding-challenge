import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
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
            // preOrder build...
            Node newNode = new Node(nodes[i]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public void levelOrder(Node rt){
            if(rt==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(rt);
            // for next line
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj = new BinaryTree();
        Node root = obj.buildTree(nodes);
        obj.levelOrder(root);
    }
}

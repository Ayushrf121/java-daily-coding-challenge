public class PreOrder {
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
        public void preOrder(Node rt){
            if(rt==null){
                return;
            }
            System.out.print(rt.data+"->");
            preOrder(rt.left);
            preOrder(rt.right);
            return;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj = new BinaryTree();
        Node root = obj.buildTree(nodes);
        obj.preOrder(root);
        System.out.println("NULL");
    }
}

public class DiameterBT {
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
    public static int height(Node rt){
        if(rt==null){
            return 0;
        }
        int lh = height(rt.left);
        int rh = height(rt.right);
        return Math.max(lh, rh)+1;
    }
    // O(n^2)
    public static int diameter(Node rt){
        if(rt==null){
            return 0;
        }
        int ld=diameter(rt.left);
        int lh = height(rt.left);
        int rd=diameter(rt.right);
        int rh = height(rt.right);
        int selfDiameter = lh+rh+1;
        return Math.max(selfDiameter,Math.max(ld, rd));
    }
    static class Info {
        int diameter;
        int height;
        Info(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    // O(n)
    public static Info diameter2(Node rt){
        // base case 
        if(rt==null){
            return new Info( 0, 0);
        }
        // storing the info ie. diameter and height.
        Info leftInfo = diameter2(rt.left);
        Info rightInfo = diameter2(rt.right);
        int diam = Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.height+rightInfo.height+1);
        int ht = Math.max(leftInfo.height,rightInfo.height)+1;
        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("The diameter of this tree is : "+diameter(root));
        System.out.println("The diameter of this tree is : "+diameter2(root).diameter);
    }
}

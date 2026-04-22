// Given a sorted array create a Balanced BST;
public class BalancedBST {
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
    public static Node createBBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid = st+(end-st)/2;
        Node createNode = new Node(arr[mid]);
        createNode.left = createBBST(arr, st, mid-1);
        createNode.right = createBBST(arr, mid+1,end);
        return createNode;
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
        int arr[] = {2,3,4,6,8,10,12,14,18,19};
        Node root = null;
        root = createBBST(arr, 0, arr.length-1);
        inOrder(root);
    }
}

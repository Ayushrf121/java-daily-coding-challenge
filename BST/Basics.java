//  Creating the BST not BT.

import java.util.Scanner;

public class Basics {
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

    static class BinarySearchTree {
        public Node buildTree(int data, Node root) {
            if (root == null) {
                Node newNode = new Node(data);
                root = newNode;
                System.out.println("The root Node of the Tree :" + root.data);
                return root;
            } else if (data < root.data) {
                root.left=buildTree(data, root.left);
                return root;
            } else if (data > root.data) {
                root.right=buildTree(data, root.right);
                return root;
            }
            System.out.println("Duplicate Nodes!");
            return root;
        }

        public void preOrder(Node rt) {
            if (rt == null) {
                return;
            }
            System.out.print(rt.data + " ");
            preOrder(rt.left);
            preOrder(rt.right);
            return;
        }
        public void inOrder(Node rt){
            if (rt == null) {
                return;
            }
            inOrder(rt.left);
            System.out.print(rt.data + " ");
            inOrder(rt.right);
            return;
        }
        public void postOrder(Node rt){
            if (rt == null) {
                return;
            }
            postOrder(rt.left);
            postOrder(rt.right);
            System.out.print(rt.data + " ");
            return;
        }
        public int countNode(Node rt){
            if(rt==null){
                return 0;
            }
            int lCount=countNode(rt.left);
            int rCount=countNode(rt.right);
            return lCount+rCount+1;
        }
        public int sumNode(Node rt){
            if(rt==null){
                return 0;
            }
            int lSum=sumNode(rt.left);
            int rSum=sumNode(rt.right);
            return lSum+rSum+rt.data;
        }
        public int leafNode(Node rt){
            if(rt==null){
                return 0;
            }
            if(rt.left==null && rt.right==null){
                return 1;
            }
            int lLeaf=leafNode(rt.left);
            int rLeaf=leafNode(rt.right);
            return lLeaf+rLeaf;
        }
        public int leftOnly(Node rt){
            if(rt==null){
                return 0;
            }
            if(rt.left!=null && rt.right==null){
                return 1;
            }
            int lLeaf=leafNode(rt.left);
            int rLeaf=leafNode(rt.right);
            return lLeaf+rLeaf;
        }
        public int rightOnly(Node rt){
            if(rt==null){
                return 0;
            }
            if(rt.left==null && rt.right!=null){
                return 1;
            }
            int lLeaf=leafNode(rt.left);
            int rLeaf=leafNode(rt.right);
            return lLeaf+rLeaf;
        }
        public int bothOnly(Node rt){
            if(rt==null){
                return 0;
            }
            if(rt.left!=null && rt.right!=null){
                return 1;
            }
            int lLeaf=leafNode(rt.left);
            int rLeaf=leafNode(rt.right);
            return lLeaf+rLeaf;
        }
        public int countForLeftandRightNode(Node rt){
            if(rt==null){
                return 0;
            }
            return 1+countForLeftandRightNode(rt.left)+countForLeftandRightNode(rt.right);
        }
        public int leftOfRoot(Node rt){
            if (rt==null) {
                return 0;
            }
            return countForLeftandRightNode(rt.left);
        }
        public int rightOfRoot(Node rt){
            if (rt==null) {
                return 0;
            }
            return countForLeftandRightNode(rt.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=0,choice=0;
        Node root = null;
        BinarySearchTree obj = new BinarySearchTree();
        do {
            System.out.println("1.Create BST\n2.PreOrder\n3.InOrder\n4.PostOrder\n5.Total Nodes\n6.Sum of Total Nodes\n7.Total Leaves\n8.Total Node having LeftOnly\n9.Total Node having RightOnly\n10.Total Node having BothOnly\n11.Total Node having LeftOfRoot only\n12.Total Node having RightOfRoot only");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Value : ");
                    value = sc.nextInt();
                    root=obj.buildTree(value, root);
                    break;
                case 2:
                    obj.preOrder(root);
                    break;
                case 3:
                    obj.inOrder(root);
                    break;
                case 4:
                    obj.postOrder(root);
                    break;
                case 5:
                    int count=obj.countNode(root);
                    System.out.println("Total No. of Nodes: "+count);
                    break;
                case 6:
                    int sum=obj.sumNode(root);
                    System.out.println("Total sum of No. of Nodes: "+sum);
                    break;
                case 7:
                    int leaves=obj.leafNode(root);
                    System.out.println("Total leaf nodes: "+leaves);
                    break;
                case 8:
                    int leftOnly=obj.leftOnly(root);
                    System.out.println("Total Nodes having left only: "+leftOnly);
                    break;
                case 9:
                    int rightOnly=obj.rightOnly(root);
                    System.out.println("Total Nodes having right only: "+rightOnly);
                    break;
                case 10:
                    int both=obj.bothOnly(root);
                    System.out.println("Total nodes having both roots: "+both);
                    break;
                case 11:
                    int leftOfRoot=obj.leftOfRoot(root);
                    System.out.println("Total nodes at left of root only: "+leftOfRoot);
                    break;
                case 12:
                    int rightOfRoot=obj.rightOfRoot(root);
                    System.out.println("Total nodes at right of root only: "+rightOfRoot);
                    break;     
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            System.out.println("\n\n\n");
        } while (choice>0 && choice<=12);
    }
}

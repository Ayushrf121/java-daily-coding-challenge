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
            System.out.print(rt.data + "->");
            preOrder(rt.left);
            preOrder(rt.right);
            return;
        }
        public void inOrder(Node rt){
            if (rt == null) {
                return;
            }
            inOrder(rt.left);
            System.out.print(rt.data + "->");
            inOrder(rt.right);
            return;
        }
        public void postOrder(Node rt){
            if (rt == null) {
                return;
            }
            postOrder(rt.left);
            postOrder(rt.right);
            System.out.print(rt.data + "->");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=0,choice=0;
        Node root = null;
        BinarySearchTree obj = new BinarySearchTree();
        do {
            System.out.println("1.Create BST\n2.PreOrder\n3.InOrder\n4.PostOrder");
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
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            System.out.println("NULL");
        } while (choice>0 && choice<=4);
    }
}

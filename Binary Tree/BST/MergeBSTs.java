import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MergeBSTs {

    HashMap<Integer, TreeNode> roots = new HashMap<>();

    private boolean dfs(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        if (node.left == null && node.right == null) {
            TreeNode mergeRoot = roots.get(node.val);
            if (mergeRoot != null && mergeRoot != node) {
                node.left = mergeRoot.left;
                node.right = mergeRoot.right;
                roots.remove(node.val);
            }
        }

        return dfs(node.left, min, node.val)
                && dfs(node.right, node.val, max);
    }

    public TreeNode canMerge(List<TreeNode> trees) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Store roots and count frequencies
        for (int i = 0; i < trees.size(); i++) {
            TreeNode root = trees.get(i);

            roots.put(root.val, root);

            freq.put(root.val,
                    freq.getOrDefault(root.val, 0) + 1);

            if (root.left != null) {
                freq.put(root.left.val,
                        freq.getOrDefault(root.left.val, 0) + 1);
            }

            if (root.right != null) {
                freq.put(root.right.val,
                        freq.getOrDefault(root.right.val, 0) + 1);
            }
        }

        TreeNode mainRoot = null;

        for (int i = 0; i < trees.size(); i++) {
            TreeNode root = trees.get(i);

            if (freq.get(root.val) == 1) {
                mainRoot = root;
                break;
            }
        }

        if (mainRoot == null) {
            return null;
        }

        roots.remove(mainRoot.val);

        if (!dfs(mainRoot, Long.MIN_VALUE, Long.MAX_VALUE)) {
            return null;
        }

        if (!roots.isEmpty()) {
            return null;
        }

        return mainRoot;
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        // Tree 1: [2,1]
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(1);

        // Tree 2: [3,2,5]
        TreeNode t2 = new TreeNode(3);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(5);

        // Tree 3: [5,4]
        TreeNode t3 = new TreeNode(5);
        t3.left = new TreeNode(4);

        List<TreeNode> trees = new ArrayList<>();
        trees.add(t1);
        trees.add(t2);
        trees.add(t3);

        MergeBSTs obj = new MergeBSTs();

        TreeNode mergedRoot = obj.canMerge(trees);

        if (mergedRoot == null) {
            System.out.println("Cannot merge into a valid BST");
        } else {
            System.out.println("Inorder Traversal of Merged BST:");
            inorder(mergedRoot);
        }
    }
}
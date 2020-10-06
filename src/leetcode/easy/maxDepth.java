package leetcode.easy;

public class maxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() { }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepthSol(TreeNode root) {
        if (root == null)
            return 0;
        int left = 1 + maxDepthSol(root.left);
        int right = 1 + maxDepthSol(root.right);
        return Math.max(left, right);
    }
}

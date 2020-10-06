package leetcode.easy;

public class mergeTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Time complexity : O(m)O(m). A total of mm nodes need to be traversed. Here, mm represents the minimum number of nodes from the two given trees.
    // Space complexity : O(m)O(m). The depth of the recursion tree can go upto mm in the case of a skewed tree. In average case, depth will be O(logm)O(logm)

    public TreeNode mergeTreesSol(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTreesSol(t1.left, t2.left);
        t1.right = mergeTreesSol(t2.right, t2.right);
        return t1;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
       return BST(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }
    public boolean BST(TreeNode rt, long small, long big) {
        if (rt == null) return true;
        if (rt.val <= small || rt.val >= big) return false;
        return BST(rt.left,small,rt.val) && BST(rt.right, rt.val, big);
    }
}
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
    public int maxDepth(TreeNode root) {
        int root1 = 0;
        int root2 = 0;
        if (root != null) {
            root1 = maxDepth(root.left);
            root2 = maxDepth(root.right);
            return Math.max(root1,root2) + 1; 
        }
        return 0;
    }
}
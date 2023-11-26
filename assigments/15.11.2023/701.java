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
    public TreeNode insertIntoBST(TreeNode root, int val) {
       return BST(root, val);
    }
    private TreeNode BST(TreeNode rt, int k) {
        if (rt == null) return new TreeNode(k);
        if (rt.val < k) {
            rt.right = BST(rt.right,k);
        }
        else {
            rt.left = BST(rt.left,k);
        }
        return rt;
    }
}
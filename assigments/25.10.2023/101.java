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
    public boolean isSymmetric(TreeNode root) {
        return isTrue(root.left,root.right);
    }

    public boolean isTrue(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null) return true;
        else if (T1 == null || T2 == null) return false;
        return (isTrue(T1.left,T2.right) && isTrue(T1.right,T2.left) && (T1.val == T2.val));
    }    
}


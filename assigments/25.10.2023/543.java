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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left_child = 1+ Blnc(root.left);
        int right_child = 1+ Blnc(root.right);
         if(Math.abs(left_child - right_child)>1)
        return false;
        return isBalanced(root.left) && isBalanced(root.right);  
    }
    public static int Blnc(TreeNode root) {
        if(root != null) {
        return Math.max(Blnc(root.left), Blnc(root.right) ) +1;
    }
    return 0;
    }
}
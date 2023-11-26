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
    public int maxPathSum(TreeNode root) {
        int[] cpx = new int[1];
        cpx[0] = Integer.MIN_VALUE;
        maximaPathSum(root, cpx);
        return cpx[0];   
    }
    public static int maximaPathSum(TreeNode root, int[] cpx){
        if(root == null) return 0;
        int r1 = Math.max(0, maximaPathSum(root.left, cpx));
        int r2 = Math.max(0, maximaPathSum(root.right, cpx));
        cpx[0] = Math.max(cpx[0], root.val + r1 + r2);
        return root.val + Math.max(r1, r2);
    }
}
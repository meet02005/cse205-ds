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
    int k = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int A = Integer.MIN_VALUE;
        int B = Integer.MAX_VALUE;
        return preorderBST(preorder, A, B);
    }
    public TreeNode preorderBST(int[] preorder, int less, int High) {
        if(k>=preorder.length) {
            return null;
        }
        if(preorder[k]<less||preorder[k]>High) {
            return null;
        }
        TreeNode treenode = new TreeNode(preorder[k]);
        k++;
        treenode.left = preorderBST(preorder, less, treenode.val);
        treenode.right = preorderBST(preorder, treenode.val, High);
        return treenode;
    }
}
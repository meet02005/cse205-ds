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
    public TreeNode searchBST(TreeNode root, int val) {
        return BST(root,val);
    }
    private TreeNode BST(TreeNode Tr, int value) {
        if (Tr == null) return null;
            if (Tr.val == value) return Tr;
            else if (Tr.val > value) return BST(Tr.left,value);
            return BST(Tr.right,value); 
        }
}
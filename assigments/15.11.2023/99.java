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
    TreeNode Last=null;
    TreeNode Current=null;
    TreeNode Next=null;
    void InOrder(TreeNode rt){
        if(rt==null) return;
        InOrder(rt.left);
        if(Last!=null && rt.val<Last.val){
            if(Current==null)
                Current=Last;
            Next=rt;
        }
        Last=rt;
        InOrder(rt.right);
    }
    public void recoverTree(TreeNode root) {
        if(root==null) return; 
        InOrder(root);
        int A=Current.val;
        Current.val=Next.val;
        Next.val=A;
    }
}
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
    int in = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return major( 0, inorder.length-1, preorder, inorder);
    }
    public TreeNode major( int In1, int In2, int[] preorder, int[] inorder){
        if(In1>In2) return null;
        int j = minor(preorder[in], inorder, In1, In2);
        TreeNode node = new TreeNode(preorder[in]);
        in++;
        node.left = major( In1, j-1, preorder, inorder);
        node.right = major( j+1, In2, preorder, inorder);
        return node;
    }
    public int minor(int value, int[] inorder,int start, int end){
        while(start < end && inorder[start] != value && inorder[end] != value) {
            start++;
            end--;
        }
        return inorder[start] == value ? start : end;
    }
}
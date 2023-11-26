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
    int A = 0;
    List<Integer> arraylist = new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return arraylist;
        rightSideView(root,1);
        return arraylist;
    }
    public void rightSideView(TreeNode root, int M) {
        if (root == null) return;
        if (A < M) {
            arraylist.add(root.val);
            A = M;
        }
        rightSideView(root.right,M+1);
        rightSideView(root.left,M+1);
    }
}
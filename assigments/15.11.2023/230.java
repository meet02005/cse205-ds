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
    ArrayList<Integer> kthsmallest = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        KThSmallest(root,kthsmallest);
        return kthsmallest.get(k - 1);
    }
    private void KThSmallest(TreeNode r, ArrayList kthsmallest) {
        if (r == null) return;
        KThSmallest(r.left, kthsmallest);
        kthsmallest.add(r.val);
        KThSmallest(r.right, kthsmallest);
        return;
    } 
}
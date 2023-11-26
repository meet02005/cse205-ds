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
    private List<Integer> cse = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        Is(root,cse);
        return cse;   
    }
        public void Is(TreeNode T1, List<Integer> cse) {
            if (T1 != null) {
                Is(T1.left,cse);
                cse.add(T1.val);
                Is(T1.right,cse);
            }
        }
    }
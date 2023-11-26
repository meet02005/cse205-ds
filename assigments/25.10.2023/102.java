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
    List<List<Integer>> decide = new ArrayList<>();
  public List<List<Integer>> levelOrder(TreeNode root) {
        label( root, 0 );
      return decide;
  }
     public void label(TreeNode root, int level){
         if (root == null) return;
         if (decide.size() < level+1)
             decide.add(new ArrayList<>());
             decide.get(level).add(root.val);
         label(root.left, level+1);
         label(root.right, level+1);
     }
}
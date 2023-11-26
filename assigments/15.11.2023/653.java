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
    public boolean findTarget(TreeNode root, int k) {
            List<Integer> list = new ArrayList<>();
            twoSum(root, list);
            int i = 0, j = list.size()-1;
            while(i < j){
                int Sum = list.get(i) + list.get(j);
                if(Sum == k){
                    return true;
                }
                if(Sum <= k){ 
                    i++;
                }
                else{
                    j--;
                }
            }
            return false;
    }
    public void twoSum(TreeNode rt,List<Integer> list){
            if(rt==null){
                return;
            }
            twoSum(rt.left, list);
            list.add(rt.val);
            twoSum(rt.right, list);
    }
}
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
    Map<Integer,Map<Integer,List<Integer>> > mapping;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        mapping =new TreeMap<>();
        pO(root,0,0);
        List<List<Integer>> res = new ArrayList<>();
        
        for(Integer i:mapping.keySet()){
            List<Integer> temp=new ArrayList<>();
            for(Integer j:mapping.get(i).keySet()){
                Collections.sort(mapping.get(i).get(j));
                temp.addAll(mapping.get(i).get(j));
            }
            res.add(temp);
        }
        
        return res;
    }
    void pO(TreeNode root,int r,int c){
        if(root==null)  return;
        mapping.computeIfAbsent(c,i->new TreeMap<>()).
            computeIfAbsent(r,i->new ArrayList<>()).
            add(root.val);
        pO(root.left,r+1,c-1);
        pO(root.right,r+1,c+1);
    }
}
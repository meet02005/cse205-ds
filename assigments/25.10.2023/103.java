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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root ==null) return new ArrayList<>();
        List<List<Integer>> arraylist = new ArrayList<>(); 
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        boolean isItReversible=true;
        while(!queue.isEmpty()){
            int length = queue.size();
            ArrayList<Integer> newList = new ArrayList<>();        
            for(int i=0; i<length; i++){
                TreeNode c = queue.poll();
                if(c.left != null) queue.offer(c.left);
                if(c.right != null) queue.offer(c.right);
                newList.add(c.val);                
            }
            if(!isItReversible){
                Collections.reverse(newList);
            }
            arraylist.add(newList);
            isItReversible= !isItReversible;
        }
        return arraylist;
    }
}
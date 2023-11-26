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
public class Solution {
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        TreeNode k = null;
        if (key < root.val) {
            root.left=deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right=deleteNode(root.right, key);
        } else {
            if (root.left==null) {
                k=root.right;
                root.right=null;
                return k;
            } else if (root.right==null) {
                k=root.left;
                root.left=null;
                return k;
            }
            k = delete(root.right);
            root.val = k.val;
            root.right = deleteNode(root.right, k.val);
        }
        return root; 
    }
    public static TreeNode delete(TreeNode rt) {
        while (rt.left != null) {
            rt = rt.left;
        }
        return rt;
    }
}
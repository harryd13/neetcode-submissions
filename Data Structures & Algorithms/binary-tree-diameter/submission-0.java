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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null) return 0;
        int h = height(root.left)+height(root.right);
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        return Math.max(h,Math.max(l,r));

    }
    public int height(TreeNode r){
        if(r == null) return 0;
        int l = height(r.left);
        int rt = height(r.right);
        return 1+ Math.max(l,rt);
    }
}

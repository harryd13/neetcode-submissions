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
    private int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
    public int height(TreeNode r){
        if(r == null) return 0;
        int l = height(r.left);
        int rt = height(r.right);
        ans = Math.max(ans, l+rt);
        return 1+ Math.max(l,rt);
    }
}

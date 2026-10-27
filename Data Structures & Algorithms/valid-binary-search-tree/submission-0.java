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
    public boolean isValidBST(TreeNode root) {
        //null
        //this is a binary tree
        //right > root > left '//' almost but we need range
        // and both tree are true as well
        return solve(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean solve(TreeNode root, Integer a, Integer b){
        if(root == null) return true;
        if(root.val >= b || root.val <= a) return false;
        return solve(root.left, a, root.val) && solve(root.right, root.val, b);
    }
}

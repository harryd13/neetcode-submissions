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

// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root == null) return true;
//         int lh = height(root.left);
//         int rh = height(root.right);

//         if(Math.abs(lh-rh) > 1) return false;
//         return isBalanced(root.left) && isBalanced(root.right);
//     }

//     public int height(TreeNode root){
//         if(root == null) return 0;
//         return (1+Math.max(height(root.left), height(root.right)));
//     }
// }/

class Solution {
    public boolean isBalanced(TreeNode root) {
       return !(validh(root) == -1);
    }
    public int validh(TreeNode r){
        if(r == null) return 0;
        int lh = validh(r.left);
        if(lh == -1) return -1;
        int rh = validh(r.right);
        if(rh == -1) return -1;
        if(Math.abs(lh-rh) > 1) return -1;
        return(1 + Math.max(lh,rh));
    }
}

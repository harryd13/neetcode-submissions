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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //Base case
        if(root == null || root == p || root == q) return root;
        // check left and right subtrees
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if(l == null && r != null){
            return r; // r tree found any one p/q
        }
        else if (l != null && r == null){
            return l; //l tree found any one of p/q
        }
        else if (l == null && r == null){
            return null; //l tree found any one of p/q
        }
        else {
            return root; //case where l and r are both p, q
        }

    }
}

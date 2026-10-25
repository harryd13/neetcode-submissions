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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null) return answer;
        Deque<TreeNode> q = new ArrayDeque<>();

        q.offer(root);
        while(!q.isEmpty()){
            int levelCount = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<levelCount;i++){
                TreeNode out = q.poll();
                if(out.left != null) q.offer(out.left);
                if(out.right != null) q.offer(out.right);
                ans.add(out.val);
            }
            answer.add(ans);
        }

        return answer;
    }
}

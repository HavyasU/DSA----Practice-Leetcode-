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
    boolean DFS(TreeNode node, int sum, int target){
        if(node == null) return false;

        sum+=node.val;
        // if(sum == target) return true;

        boolean left = DFS(node.left, sum, target);
        boolean right=  DFS(node.right, sum, target);
        if(node.left==null && node.right==null && sum == target) return true;
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return DFS(root, 0, targetSum);
    }
}
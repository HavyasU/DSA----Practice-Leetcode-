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
    int count = 0;
    void DFS(TreeNode node, int max){
        if(node==null){
            return;
        }
        if(node.val >= max){
            max = node.val;
            count++;
        }
        DFS(node.left, max);
        DFS(node.right,max);
    }
    public int goodNodes(TreeNode root) {
        int max = Integer.MIN_VALUE;
        DFS(root, max);
        return count;
    }
}
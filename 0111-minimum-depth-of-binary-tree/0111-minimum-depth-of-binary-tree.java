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
    int min = 99999;
    void DFS(TreeNode node,int count){
        if(node == null){
            return;
        }
        count++;
        if(node.left == null && node.right==null){
            if(count < min) min = count; 
        }
        DFS(node.left,count);
        DFS(node.right,count);
    }
    public int minDepth(TreeNode root) {
        DFS(root,0);
        return min==99999?0:min;
    }
}
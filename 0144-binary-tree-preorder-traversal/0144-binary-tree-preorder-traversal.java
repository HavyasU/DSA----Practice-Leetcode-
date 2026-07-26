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
    ArrayList<Integer> lst = new ArrayList<>();
    void DFS(TreeNode node){
        if(node == null){
            return;
        }

        lst.add(node.val);
        DFS(node.left);
        DFS(node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        DFS(root);
        return lst;
    }
}
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
    ArrayList<String> lst = new ArrayList<>();
    void DFS(TreeNode node, String path){
        if(node == null) return;

        if(node.left==null && node.right==null){
            lst.add(path + node.val);
            return;
        }

        DFS(node.left, path+node.val+"->");
        DFS(node.right, path+node.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        DFS(root,new String());
        return lst;
    }
}
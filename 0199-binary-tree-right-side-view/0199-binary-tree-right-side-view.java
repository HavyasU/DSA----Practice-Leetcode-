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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=1;i<=size;i++){
                TreeNode item = queue.poll();
                if(i == size) result.add(item.val);
                if(item.left!=null) queue.offer(item.left);
                if(item.right!=null) queue.offer(item.right);
            }

            
        }
        return result;
    }
}
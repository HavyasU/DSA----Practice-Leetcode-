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
        List<List<Integer>> result = new ArrayList<>();

        if(root==null)
        return result;

        Queue<TreeNode> queue = new ArrayDeque<>();

    
        queue.offer(root);

        while(!queue.isEmpty()){

            int size = queue.size();

            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode nodeItem = queue.poll();
                
                level.add(nodeItem.val);
                if(nodeItem.left!=null)
                    queue.offer(nodeItem.left);

                if(nodeItem.right!=null)
                    queue.offer(nodeItem.right);

                
               

            }
             if(!level.isEmpty())
                result.add(level);
            
        }

        return result;

    }
}
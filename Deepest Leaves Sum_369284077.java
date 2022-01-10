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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int max_level=height(root);
        int sum=0;
        int level=0;
        int level_sum=0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            level_sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                
                level_sum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            
            
        }
        return level_sum;
        
        
    }
    public static int height(TreeNode root){
        int h=0;
        if(root==null){
            return 0;
        }
        else{
        int l=height(root.left);
        int r=height(root.right);
        h=Math.max(l,r)+1;
        }
        return h;
        
    }
    
}

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>op=new ArrayList<>();
        if(root==null){
            return op;
        }
        return inOrder(root,op);
    }
    public List<Integer> inOrder(TreeNode root,List<Integer>op){
        if(root==null){
            return op;
        }
        inOrder(root.left,op);
        op.add(root.val);
        inOrder(root.right,op);
        return op;
    }
}

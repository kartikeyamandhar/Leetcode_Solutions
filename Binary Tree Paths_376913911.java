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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>op=new ArrayList<>();
        if(root==null){
            return op;
        }
        StringBuilder sb=new StringBuilder();
        dfs(root,op,sb);
        return op;
    }
    public static void dfs(TreeNode root, List<String>op,StringBuilder sb){
        if(root.left==null && root.right==null){
            op.add(new StringBuilder(sb).append(root.val).toString());
            return;
        }
        if(root.left!=null){
            dfs(root.left,op,new StringBuilder(sb).append(root.val).append("->"));
        }
        if(root.right!=null){
            dfs(root.right,op,new StringBuilder(sb).append(root.val).append("->"));
        }
    }
}

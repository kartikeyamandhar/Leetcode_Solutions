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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<List<Integer>>();
        if(root==null){
            return list;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>lst=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                lst.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                
            }
            if(list.size()%2==1){
                Collections.reverse(lst);
            }
            list.add(lst);
        }
        return list;
    }
}

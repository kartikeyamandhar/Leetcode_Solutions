/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>stack=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            stack.push(curr.val);
            curr=curr.next;
        }
        ListNode curr1=head;
        while(stack.size()!=0 && curr1!=null){
            int ref=stack.peek();
            stack.pop();
            if(ref!=curr1.val){
                return false;
            }
            curr1=curr1.next;
            
        }
        return true;
        
    }
}

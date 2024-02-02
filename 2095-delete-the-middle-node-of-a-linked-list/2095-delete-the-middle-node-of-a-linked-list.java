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
    public ListNode deleteMiddle(ListNode head) {
 
        //find middle of linked list 
        
        if(head==null)
            return head;
        
        if(head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        
        
        if(fast.next.next==null){
            fast.next=null;
            return head;
        }
        while(fast!=null&&fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            
            
        }
        if(slow!=null){
                System.out.println(slow.val);
            
            if(slow.next!=null){
                slow.val=slow.next.val;
                slow.next=slow.next.next;
            }else{
                slow=null;
            }
            
            
            }
      return head;
        
    }
}
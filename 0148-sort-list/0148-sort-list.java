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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode mid = findMid(head);
        ListNode newHead = mid.next;
        mid.next = null;
        
        ListNode lefthalf = sortList(head);
        ListNode secondhalf = sortList(newHead);
        return merge(lefthalf, secondhalf);
        
    }
    
    public ListNode findMid(ListNode head){
        
        
        ListNode slow= head;
        ListNode fast = head;
        
          while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
    
    public ListNode merge(ListNode head1, ListNode head2){
        
        ListNode dummy =new ListNode(0);
        ListNode curr =dummy;
        
        while(head1!=null && head2!=null){
            
            if(head1.val<head2.val){
                curr.next = head1;
                head1=head1.next;
            }else{
                curr.next = head2;
                head2=head2.next;
            }
            curr=curr.next;
            
        }
        if(head1==null){
            curr.next=head2;
        }
        if(head2==null){
            curr.next=head1;
        }
        return dummy.next; 
        
    } 
    
    
}
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
    public ListNode insertionSortList(ListNode head) {
        
        //compare a value with every other value previous to it. 
        
   //     if(head==null || head.next==null)
    //    return head;
        
        ListNode dummy = new ListNode(-1);
   
       
        
        ListNode curr = head; 
            
        while(curr!=null){
             ListNode prev= dummy;
            
            while(prev.next!=null && prev.next.val<=curr.val){
                prev=prev.next;
            }
            
             ListNode next = curr.next;
            curr.next = prev.next;
            prev.next= curr;
           
            curr = next; 
            
        }
        return dummy.next; 
        
    }
}
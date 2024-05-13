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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
         //move to n steps 
        ListNode temp = head;
        if(head==null){
            return head; 
        }
        
        for(int i=0; i<n; i++){
            if(temp!=null)
            temp=temp.next; 
        }
        
        if (temp == null) {
            return head.next;
        }
        
        ListNode curr = head;
        
        while(temp!=null && temp.next!=null){
            curr=curr.next;
            temp=temp.next;
        }
        
     //   System.out.println(curr.val );
        if(curr.next!=null)
        curr.next = curr.next.next;
       
        return head; 
        
        
    }
}
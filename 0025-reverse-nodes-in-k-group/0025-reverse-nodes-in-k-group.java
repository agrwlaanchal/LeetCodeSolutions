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
    public ListNode reverseKGroup(ListNode head, int k) {
     
        
        //reverse k nodes
        // after that if nodes are still remaining
        // call reverse on it again 
        // cuur->next = reverse()
        if(head==null){
            return null;
        }
        
        //check count
        ListNode temp = head;
        int tempcount =0;
        while(temp!=null){
            temp=temp.next;
            tempcount++;
        }
        
        if(tempcount<k){
            return head;
        }
        
        
        ListNode curr= head;
        ListNode next = null;
        ListNode prev=null;
        int count=0 ;
        while(count<k && curr!=null ){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next; 
            count++;
        }
        
       
        
        if(next!=null){
            ListNode res = reverseKGroup(next, k);
            head.next = res;
        }
        
        return prev; 
        
        
    }
}
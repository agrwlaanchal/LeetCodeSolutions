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
    public ListNode swapNodes(ListNode head, int k) {
        
        int count =1;
        ListNode temp =head;
        while(count<k){
            
            temp=temp.next;
            count++;
        }
        
        ListNode first = temp;
       // System.out.println(first.val+" "+count);
        ListNode start=head;
        
        while(temp.next!=null){
            temp=temp.next;
            start=start.next;
        }
        
       // System.out.println(start.val+" "+first.val);
        
        int tval = start.val;
        start.val = first.val;
        first.val = tval;
        
        return head;
        
        
    }
}
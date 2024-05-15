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
    public ListNode rotateRight(ListNode head, int k) {
        
        
         if(head == null){
            return head;
        }
        
        int count =1;
        
        ListNode temp = head;
        while(temp.next!=null){
           
            temp=temp.next;
             count++;
        }
        
        temp.next = head;
     // System.out.println(count);
        int i = count - (k%count);
        
        while(i>1){
            head=head.next;
            i--;
        }
        ListNode newHead =head.next;
        head.next =null;
        return newHead;
        
        
        
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
    
        if(head==null)
            return null; 
        
        ListNode slow = head;
        ListNode fast=head;
        
        System.out.println(slow.val);
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast =fast.next.next;
            if(slow==fast)
            { 
               slow = head;
               while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next;
            //    count++;
            }
             System.out.println(slow.val);
            return slow;
                
            }
            
        }
    
            return null;
       
    }
    
}
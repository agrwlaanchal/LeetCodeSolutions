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
    public ListNode removeZeroSumSublists(ListNode head) {
     
       
        // make hashmap of prefixsum and node
        // duplicate prefix will be replaced 
        
        
        //create a dummy node 
        
        ListNode dummy  = new ListNode(0, head);
        ListNode current = dummy; 
        
        int presum =0; 
        HashMap<Integer, ListNode> hmap = new HashMap<>();
        
        //hmap.put(0, dummy);
        
        while(current!=null){
            presum = presum + current.val;
            hmap.put(presum, current);
            current=current.next; 
        }
        
        
        //reset presum =0 and current=dummy;
        
        
        presum =0;
        current = dummy;
        
        while(current!=null){
            presum = presum+current.val;
            
            current.next = hmap.get(presum).next; 
            current = current.next; 
        }
        
        return dummy.next; 
        
        
    }
}
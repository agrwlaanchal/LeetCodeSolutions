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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        if(nums.length==0)
            return head; 
       
        //convert array to set 
        Set<Integer> mySet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
       
       //create a dummy node to handle the case if head is in set 
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //result node, initially pointing to dummy node
        ListNode res = dummy; 
        
        ListNode temp =head;
        
        while(temp!=null){
            
            
            if(!mySet.contains(temp.val)){
                dummy.next =temp;        
                dummy=dummy.next;
            }
            temp=temp.next;
            
        }
        dummy.next = temp;
        return res.next; 
    }
}
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
     
        
        //find first node a-1
        ListNode dummy = new ListNode(0);
        dummy.next = list1; 
        
        ListNode curr = dummy; 
        int index =0; 
        while(index!=a){
            curr=curr.next;
            index++;
        }
        
      //  System.out.println(curr.val);
        
       ListNode node1 = curr;
        ListNode temp = null;
         while(index!=b+1 && curr!=null){
             curr=curr.next;
             index++;
         }
       // System.out.println(curr.val);
        
      
        node1.next = list2;
        while(node1.next!=null){
            node1=node1.next;
        }
        if(curr.next!=null){
            node1.next = curr.next;
        }
        
        return dummy.next;
       
        
        // curr.next = list2; 
        
        
    }
}
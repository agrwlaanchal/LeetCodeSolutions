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
    public void reorderList(ListNode head) {
        
        ListNode temp = head;
        int count =0;
        
        Stack<ListNode> st = new Stack<>();
        
        while(temp!=null)
        {
            st.push(temp);
            count++;
            temp=temp.next;
        }
        
        // keep the head, save head.next  
        ListNode curr = head;
        
        for(int i=0; i<count/2;i++){
            
            ListNode next = curr.next; 
            curr.next = st.pop();
            curr.next.next = next;
            curr=next; 
            
        }
        curr.next=null;
        
        
        
    }
}
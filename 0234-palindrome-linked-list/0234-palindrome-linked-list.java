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
    public boolean isPalindrome(ListNode head) {
     
        if(head==null)
            return true;
        
        ListNode temp =head; 
        
        Stack<Integer> st =new Stack<>();
        
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        
        temp=head;
        
        while(!st.isEmpty()){
            
            int t =st.pop();
            if(temp.val!=t){
                return false;
            }
            temp=temp.next;
            
        }
        
        return true; 
        
        
    }
}
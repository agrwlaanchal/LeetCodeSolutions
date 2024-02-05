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
    public int pairSum(ListNode head) {
    
        Stack<Integer> st = new Stack<>();
        int count =0 ;
        int sum =0 ;
        
        
        ListNode temp =head;
        
        while(temp!=null){
            st.push(temp.val);
            count++;
            temp=temp.next;
        }
        
        
        int len = count/2;
        
        temp=head;
        
        for(int i=0;i<len;i++){
            
            sum=Math.max(sum, temp.val+st.pop());
            temp=temp.next;
            
        }
        
        
        return sum ; 
        
        
        
        
        
    }
}
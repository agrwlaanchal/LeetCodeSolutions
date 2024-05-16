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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        Stack<ListNode> st1 = new Stack<>();
        Stack<ListNode>st2 = new Stack<>();
        
        while(l1!=null){
            
            st1.push(l1);
            l1=l1.next;
            
        }
        while(l2!=null){
            st2.push(l2);
            l2=l2.next;
        }
        
        
        ListNode res = null;
        int carry =0;
        while(!st1.isEmpty() && !st2.isEmpty()){
            carry= st1.pop().val+st2.pop().val+carry;
            ListNode temp = new ListNode(carry%10);
            carry=carry/10;
            temp.next = res;
            res=temp;
            
            
        }
        
         while(!st1.isEmpty() ){
            carry= st1.pop().val+carry;
            ListNode temp = new ListNode(carry%10);
            carry=carry/10;
            temp.next = res;
            res=temp;
        }
         while(!st2.isEmpty() ){
            carry= st2.pop().val+carry;
            ListNode temp = new ListNode(carry%10);
            carry=carry/10;
            temp.next = res;
            res=temp;
        }
        
        
        
        if(carry>0){
             ListNode temp = new ListNode(carry);

            temp.next = res;
            res=temp;
        }
        
        return res; 
        
    }
}
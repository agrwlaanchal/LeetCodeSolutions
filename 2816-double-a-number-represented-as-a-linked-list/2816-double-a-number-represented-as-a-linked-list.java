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
    public ListNode doubleIt(ListNode head) {
        
        //get the number first
        
        Stack<Integer>st = new Stack<>();
        ListNode temp = head;
        
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        
        
        ListNode res=null;
        int carry=0;
        
        while(!st.isEmpty()){
            
            int t = st.pop();
            
            int num =2*t +carry;
       //     System.out.println(t+" "+num);
             carry= num/10;
            num=num%10;
            
            if(res==null){
                temp = new ListNode(num);
                res=temp;
            }else{
                temp = new ListNode(num);
                temp.next = res;
                res=temp; 
            }
            
        }
        
        
        if(carry>0){
             if(res==null){
                temp = new ListNode(carry);
                res=temp;
            }else{
                temp = new ListNode(carry);
                temp.next = res;
                res=temp; 
            }
        }
        return res;
        
    }
}
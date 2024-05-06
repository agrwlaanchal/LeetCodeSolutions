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
    public ListNode removeNodes(ListNode head) {
     
        Stack<ListNode> st = new Stack<>();
        ListNode t =head;
        
        while(t!=null){
            
            st.push(t);
            t=t.next;
            
        }
        
        ListNode res = null;
        while(!st.isEmpty()){
            
            ListNode temp = st.peek();
            if(res==null){
                res=temp;
                st.pop();
            }else{
                if(temp.val>=res.val){
                    temp.next = res;
                    res=temp;
                    
                }
                st.pop();
            }
            
        }
        return res; 
        
        
    }
}
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
    public ListNode mergeNodes(ListNode head) {
        
        if(head==null){
            return null; 
        }
        
       // Stack<Integer> st =new Stack<>();
        ListNode start = head;
        ListNode end = head.next;
        ListNode res = null;
        ListNode resTemp = null;
         int temp =0; 
        while(end!=null){
            
            if(end.val==0){
                //empty the stack 
                
                // get sum
                 //make a new listnode 
                if(res==null){
                    res=new ListNode(temp);
                    resTemp = res;
                }else{
                    resTemp.next = new ListNode(temp);
                    resTemp =resTemp.next; 
                }
                temp=0;
               
                
            }else{
               temp=temp+end.val;
            }
            end=end.next; 
            
        }
        
        return res; 
        
    }
}
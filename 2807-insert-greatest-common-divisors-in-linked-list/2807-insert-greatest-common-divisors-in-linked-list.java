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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
     
        
        if(head==null)
            return head;
        
        ListNode temp = head;
        
        int a=temp.val;
        
        while(temp.next!=null){
            
            ListNode b = temp.next ;
            
            int bval = b.val;
            
            int newval = gcf(a,bval);
            
            ListNode newNode = new ListNode(newval);
            
            temp.next = newNode;
            newNode.next = b; 
            
            temp = newNode.next; 
            a = bval; 
          //  System.out.println(temp.val);
            
        }
        
        return head; 
        
    }
    
    public int gcf(int a, int b ){
        
        if(b==0)
            return a;
        
        return gcf(b, a%b);
    }
    
    
}
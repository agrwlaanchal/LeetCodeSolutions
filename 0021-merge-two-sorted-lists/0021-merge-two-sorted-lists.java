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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     
        
        if(list1==null && list2==null)
            return null;
        
        if(list1==null)
            return list2;
        
        if(list2==null)
            return list1;
        
        ListNode res = null;
        ListNode t =null;
        
        while(list1!=null&& list2!=null){
            
            if(list1.val<=list2.val){
                
                if(res==null){
                    res=new ListNode(list1.val);
                    t=res;
                    
                }else{
                    ListNode temp = new ListNode(list1.val);
                    t.next = temp;
                    t=t.next;
                }
                list1 =list1.next;
            }else{
                if(res==null){
                    res=new ListNode(list2.val);
                    t=res;
                    
                }else{
                    ListNode temp = new ListNode(list2.val);
                    t.next = temp;
                    t=t.next;
                }
                
                list2 =list2.next;
            }
            
        }
        
        if(list1!=null){
            t.next=list1;
        }
        if(list2!=null){
            t.next=list2;
        }
        return res;
        
        
    }
}
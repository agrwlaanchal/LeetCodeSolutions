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
    public ListNode deleteDuplicates(ListNode head) {
        
    
        ListNode res = null;
        ListNode tail = null;
        ListNode temp =head;
        
        while(temp!=null){
        //    System.out.println(temp.val);
            if(temp.next==null){
               if(res==null){
                   
                    tail = temp;
                     res = temp;
                } else{
                    tail.next = temp;
                    tail =tail.next;
                }
                temp = temp.next;
            }
           else if(temp.next!=null && temp.val != temp.next.val){
                if(res==null){
                   
                    tail = new ListNode(temp.val);
                     res =  tail;
                } else{
                    tail.next = new ListNode(temp.val);
                    tail = tail.next;
                }
               
               temp=temp.next;
            }else if(temp!=null && temp.next!=null && temp.val==temp.next.val){
                
            //   ListNode newNode = temp.next ;
               int value =temp.val;
                while(temp.val==value){
            //        System.out.println("temp is "+temp.val);
                    if(temp.next!=null){
                    temp = temp.next;
                    }else{
                        
                        return res; 
                    }
                    
                }
               
            }
            
        }
        return res;
    
    }
}
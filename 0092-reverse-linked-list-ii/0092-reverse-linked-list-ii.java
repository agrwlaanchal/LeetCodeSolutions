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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     
      
        int i = 1;
        ListNode temp = head;
        ListNode res = null;
        ListNode newN = null;
        Stack<ListNode> st = new Stack<>();
     outer:   while(temp!=null){
            
       //     System.out.println("i is "+i);
            if(i>=left && i<=right){
                st.push(temp);
                temp = temp.next;
                i++;
            } else if(i<left){
                
                if(res==null){
                     newN = new ListNode(temp.val);
                    res= newN;
                }else{
                    newN.next = new ListNode(temp.val);
                    newN = newN.next;
                }
                temp = temp.next;
                i++;
                
            } else{
                
                while(!st.isEmpty()){
                    if(res==null){
                      newN = new ListNode(st.pop().val);
                     res= newN;  
                    } else{
                       newN.next =st.pop();
                       newN = newN.next;
                    }
                }
                
                newN.next = temp;
                break outer;
            }
            
            
            
        }
        
    //    System.out.println("coming out of there");
        
        while(st.size()>1){
          //  System.out.println(st.peek().val);
         //   System.out.println(newN.val);
            if(res==null){
                      newN = new ListNode(st.pop().val);
                     res= newN;  
                    } else{
                       newN.next =st.pop();
                       newN = newN.next;
                    }
                }
        
       if(st.size()==1){
            if(res==null){
                      newN = new ListNode(st.pop().val);
                     res= newN;  
                    } else{
           newN.next = new ListNode(st.pop().val);
            }
       } 
       return res;
        
    }
}
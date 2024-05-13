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
    public int[] nextLargerNodes(ListNode head) {
      
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode next = curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
            
        }
        
        head=prev;
        
        Stack<ListNode> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        ListNode temp = head;
        while(temp!=null){
            
            while(st.isEmpty()==false && st.peek().val <= temp.val)
                   st.pop();
            
            if(st.isEmpty()){
                arr.add(0);
            }else{
                arr.add(st.peek().val);
            }
            
            st.push(temp);
            temp=temp.next;
            
        }
          int[]res = new int[arr.size()];
        
        int j=0;
        for(int i=arr.size()-1;i>=0;i--)
        {
            res[j]=arr.get(i);
            j++;
        }
       
        return res;
        
    }
}
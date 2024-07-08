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
    public ListNode mergeKLists(ListNode[] lists) {
       
        ArrayList<ListNode> arr = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode l :lists ){
            while(l!=null){
              pq.add(l.val);
              l=l.next;
            }
        }
        ListNode res = null;
        ListNode temp = null;
        
        while(!pq.isEmpty()){
            
            int t =pq.poll();
            if(res==null){
                res = new ListNode(t);
                temp=res;
            }else{
                temp.next = new ListNode(t);
                temp=temp.next;
            }
            
        }
        
        return res;
    }
}
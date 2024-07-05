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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        
        if(head==null){
            return null; 
        }
        
        
        int min = Integer.MAX_VALUE;
        int max = -1;
        
         ListNode prev = head;
         ListNode curr= head.next; 
        
        ListNode next = curr.next;
        int count =1; 
        ArrayList<Integer> arr = new ArrayList<>();
        while(next!=null){
            
            
            if(curr.val>prev.val && curr.val>next.val){
                if(arr.size()>0){
                    min = Math.min(min, count-arr.get(arr.size()-1));
                }
                arr.add(count);
            } else  if(curr.val<prev.val && curr.val<next.val){
                if(arr.size()>0){
                    min = Math.min(min, count-arr.get(arr.size()-1));
                }
                arr.add(count);
            }
            
            count++;
            prev = curr;
            curr=next;
            next = curr.next; 
        }
        
        
        if(arr.size()<2){
            return new int[]{-1,-1};
        }else{
             max = arr.get(arr.size()-1)-arr.get(0);
            return new int[]{ min,max};
        }
        
        
        
        
        
    }
}
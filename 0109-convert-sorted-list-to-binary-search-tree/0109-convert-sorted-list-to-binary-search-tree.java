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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
       //mid of the linked list 
        
        if(head==null){
            return null;
        }
        
        if(head.next==null){
             TreeNode newNode = new TreeNode(head.val);
            return newNode; 
        }
        
        ListNode mid = findMid(head);
         
       
        TreeNode res = new TreeNode(mid.val);
        
      
         res.left = sortedListToBST(head);
        res.right = sortedListToBST(mid.next);

 
 

      return res;
    }
    
    
    ListNode findMid(ListNode head){
        
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;
        ListNode prev = null;
        while (fast_ptr != null && fast_ptr.next != null) {
            // Move the fast pointer by two nodes
            prev = slow_ptr;
            fast_ptr = fast_ptr.next.next;
            // Move the slow pointer by one node
            slow_ptr = slow_ptr.next;
        }
        
        if(prev!=null){
            prev.next = null; 
        }
        
        return slow_ptr;
    }
    
    
}
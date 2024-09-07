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
    public boolean isSubPath(ListNode head, TreeNode root) {
        
        
        if(head==null)
            return true;
        
        if(root==null)
            return false;
        
        if(traverse(head, root))
            return true;
        
        //find node which is 
        return isSubPath(head, root.left)||isSubPath(head, root.right);
    }
    
  
        // Match the current tree node with the current linked list node
       
    public boolean traverse(ListNode head, TreeNode root){
         if(head==null)
            return true;
        
        if(root==null)
            return false;
        
        return head.val==root.val&&(traverse(head.next, root.left)||traverse(head.next, root.right));
      
    }
    
}
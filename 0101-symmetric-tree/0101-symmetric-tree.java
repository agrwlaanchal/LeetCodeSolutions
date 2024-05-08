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
    public boolean isSymmetric(TreeNode root) {
      
        if(root==null){
            return true;
        }
        
        if(root.left==null && root.right!=null)
            return false;
        
        if(root.right==null && root.left!=null){
            return false;
        }
        
        if(mirror(root.left, root.right)==false)
                return false;
        
        return true;
    }
    
    public boolean mirror(TreeNode a, TreeNode b){
         if (a == null && b == null) 
            return true; 
  
      
        if (a == null || b == null)  
            return false; 
  
       
        return a.val == b.val 
                && mirror(a.left, b.right) 
                && mirror(a.right, b.left); 
    }
    
    
}
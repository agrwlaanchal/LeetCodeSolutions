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
    public boolean isValidBST(TreeNode root) {
     
        
        if(root==null)
            return true;
        
        
      long left = Long.MIN_VALUE;
        long  right = Long.MAX_VALUE;
        
        return isValidBST(root, left, right);
        
    }
    
    
    public boolean isValidBST(TreeNode root, long left, long right){
        
        if(root==null)
            return true;
        
        if(root.val%10000009<left || root.val%10000009 > right)
            return false;
        
        return isValidBST(root.left, left, root.val%10000009-1)
            && isValidBST(root.right, root.val%10000009+1, right); 
        
        
    }
}
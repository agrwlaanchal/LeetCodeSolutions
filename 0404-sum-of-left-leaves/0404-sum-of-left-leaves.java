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
    int sum =0 ;
    public int sumOfLeftLeaves(TreeNode root) {
     
       if(root==null)
          return 0;
        
        
        boolean isLeft = false; 
        
         sumOfLeftLeaves(root, isLeft );
        return sum; 
    }
    
    public void sumOfLeftLeaves(TreeNode root, boolean isLeft){
        
        if(root==null)
            return ;
        
        if(  isLeft && root.left==null && root.right==null){
            sum = sum+root.val;
        }
        
        if(root.left!=null){
           sumOfLeftLeaves(root.left,  true);
        }
        if(root.right!=null)
        {
         
          sumOfLeftLeaves(root.right,  false);
        }
        
       
        
    }
    
}
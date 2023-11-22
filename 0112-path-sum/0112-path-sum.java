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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        
        int sum =0 ;
        
      return  hasPathSum(root, sum, targetSum);
        
        
        
    
        
       
        
    }
    
    
    public boolean hasPathSum(TreeNode root, int sum, int targetSum){
        
        if(root==null)
            return false;
        sum = sum+root.val;
        
        if(root.left==null && root.right==null) {
            if(sum == targetSum){
            return true;
        }else{
                return false;
            }
    
        }
        
         if( hasPathSum(root.left, sum,targetSum ) )
            return true;
        
        if(hasPathSum(root.right,sum, targetSum))
            return true;
        
        return false;
        
        
    }
    
}
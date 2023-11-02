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
     int res = 0; 
    public int averageOfSubtree(TreeNode root) {
     
     
        
        
     
        
            if(root!=null){
                
                if( root.left!=null){
                    averageOfSubtree(root.left);
                }
                  if(root.right!=null){
            averageOfSubtree(root.right);
                }
            int leftnodes = getSize(root.left); 
            int leftsum = getSum(root.left);
           
         //   System.out.println(root.val+" " +leftnodes+ " "+leftsum);
            int rightnodes = getSize(root.right);
            int rightsum = getSum(root.right);
            
            if( (leftsum+rightsum+root.val)/(leftnodes+rightnodes+1) == root.val ){
                res++;
            }
               
              
            
        }
            return res; 
        
    }
    
    
    public int getSize(TreeNode root){
        if(root==null)
            return 0;
        
        return 1+getSize(root.left)+getSize(root.right);
    }
    
    public int getSum(TreeNode root){
        
        if(root==null)
            return 0; 
        
            return root.val+getSum(root.left)+getSum(root.right);
            
        
    }
    
}
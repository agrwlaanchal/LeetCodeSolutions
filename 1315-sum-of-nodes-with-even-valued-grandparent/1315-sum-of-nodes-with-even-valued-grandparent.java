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
    public int sumEvenGrandparent(TreeNode root) {
     
        int sum =0 ;
        
        if(root==null)
            return 0;
        
        return sumEvenGrandparent(root, sum);
        
    }
    
    
    public int sumEvenGrandparent(TreeNode root, int sum){
        
        if(root==null)
            return 0;
        
        if(root.val%2==0){
            
            //root is even, find it's grandchildren
            
            if(root.left!=null){
                //check children of left node
                if(root.left.left!=null){
                    sum=sum+root.left.left.val;
                }
                
                if(root.left.right!=null){
                    sum=sum+root.left.right.val;
                }
                
            }
            
           
            
            if(root.right!=null){
                
                if(root.right.left!=null){
                    sum=sum+root.right.left.val;
                }
                
                if(root.right.right!=null){
                    sum=sum+root.right.right.val;
                }
                
            }
            
        }
        
       if(root.left!=null){
           sum=sumEvenGrandparent(root.left, sum);
       } 
        
        if(root.right!=null){
            sum=sumEvenGrandparent(root.right, sum);
        }
        
        return sum ; 
        
        
        
        
        
    }
    
}
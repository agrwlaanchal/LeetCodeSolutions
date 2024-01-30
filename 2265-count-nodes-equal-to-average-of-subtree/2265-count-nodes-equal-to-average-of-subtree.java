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
   
    int res=0; 
    public int averageOfSubtree(TreeNode root) {
        
    
        if(root==null)
            return res;
        
        int sum = average(root.left) + average(root.right)+ root.val; 
        int count = getCount(root.left) + getCount(root.right)+1;
        
        if(sum/count==root.val)
            res++;
        
       // System.out.println(root.val +" "+sum + " "+count);
        
        if(root.left!=null)
            averageOfSubtree(root.left);
        
        if(root.right!=null)
            averageOfSubtree(root.right);
       
        return res; 
        
    }
    
    
    int average(TreeNode root){
        if(root==null)
            return 0;
        
        return root.val+ average(root.left)+average(root.right);
    }
    
    int getCount(TreeNode root){
        if(root==null)
            return 0;
        
        return 1+getCount(root.left)+getCount(root.right);
    }
     
    
}
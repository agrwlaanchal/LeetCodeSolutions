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
     int par_x = -1;
        int par_y =-1;
        int level_x =-1;
        int level_y =-1;
       
    public boolean isCousins(TreeNode root, int x, int y) {
        
        //to solve this problem 
        // we need 2 things 
        // parent of each var here 
        // and level of each var here. 
         // so we can have 4 variables. 
        
          if(root.val==x){
            level_x=0;
        }
        
        if(root.val==y){
            level_y=0;
        }
        
        traverse(root, x, y, 0);
      
        
       if(par_x!=par_y && level_x==level_y){
           return true;
       }   
        return false;
        
    }
    
    public void traverse(TreeNode root, int x, int y, int level){
        
        
        if(root==null){
            return; 
        }
        
        if(root.left!=null && root.left.val==x || root.right!=null&& root.right.val==x){
            par_x=root.val;
            level_x = level+1;
        }
        
        
        if(root.left!=null && root.left.val==y || root.right!=null&& root.right.val==y){
            par_y=root.val;
            level_y = level+1;
        }
        
        traverse(root.left, x, y, level+1);
        traverse(root.right, x, y, level+1);
        
    }
    
}
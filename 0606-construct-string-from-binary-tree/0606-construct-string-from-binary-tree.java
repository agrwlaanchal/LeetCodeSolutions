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
     String res="";
    public String tree2str(TreeNode root) {
     
        
        if(root==null)
            return "";
        
        res=res+root.val;
   
        if(root.left!=null){
            res=res+"(";
            tree2str(root.left);
            res=res+")";
        }
        
        if(root.left==null && root.right!=null)
        {
            res=res+"()";
        }
        
        
        if(root.right!=null){
            res=res+"(";
            tree2str(root.right);
            res=res+")";
        }
        
        
        return res; 
        
    }
}
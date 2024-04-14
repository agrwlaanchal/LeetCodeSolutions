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
    int sum =0; 
    public int sumRootToLeaf(TreeNode root) {
       
        treepathsum(root, "");
        return sum;
    }
    
    
    public void treepathsum(TreeNode root, String val){
        
        if (root == null)
            return ;
        
        val = val+root.val;
        
        if(root.left==null&&root.right==null){
            sum=sum+Integer.parseInt(val, 2);
            return ;
        }
        
        treepathsum(root.left, val);
        treepathsum(root.right,val);
        
    }
    
    
    
}
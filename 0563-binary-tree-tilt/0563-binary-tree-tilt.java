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
    int sum; 
    int res;
    public int findTilt(TreeNode root) {
        sum =0; 
         traverse(root,sum);
        
        return res; 
        
        
        
    }
    
    public int  traverse(TreeNode root, int sum){
        
        if(root==null){
            return 0;
        }
        
       
        int leftsum =traverse(root.left,sum);
        int rightsum =traverse(root.right, sum);
         
        root.val = root.val+leftsum+rightsum;
        sum=sum+root.val;
        res=res+Math.abs(leftsum-rightsum);
        
       // System.out.println(root.val+" "+leftsum+" "+rightsum);
        
        return sum;
        
    }
    
}
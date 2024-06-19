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
    int count =0; 
    public int kthSmallest(TreeNode root, int k) {
        //if i do inorder 
        
        if(root==null){
            return -1; 
        }
        
      
        int num = kthSmallest(root.left, k);
        
        if(num!=-1){
            return num; 
        }
        
        count++;
        if(count==k)
            return root.val; 
              
            return kthSmallest(root.right, k);
         
    }
    
    
    
}
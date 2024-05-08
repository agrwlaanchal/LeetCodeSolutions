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
    public TreeNode sortedArrayToBST(int[] nums) {
     
        
        int end = nums.length-1;
        TreeNode res = convert(nums,0,end);
        return res;
        
    }
    
    public TreeNode convert(int[]nums, int start, int end){
        
        if(start>end){
            return null;
        }
        
  
            
            int mid = (start+end)/2;
            
            TreeNode res=new TreeNode(nums[mid]);
            
            res.left = convert(nums, start, mid-1);
        res.right = convert(nums,mid+1, end);
        return res;
        
        
        
    }
}
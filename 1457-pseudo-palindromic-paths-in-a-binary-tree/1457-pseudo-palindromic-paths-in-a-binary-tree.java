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
    public int pseudoPalindromicPaths (TreeNode root) {
     
        if(root==null)
            return 0;
        
        int path[] = new int[100000];
        int pathlength =0;
      
              HashSet<Integer>hset = new HashSet<>();
  
        pseudoPalindromicPaths(root, hset);
        
        return count;
    }
    
    public void pseudoPalindromicPaths(TreeNode root, HashSet<Integer>hset){
        
        
        if(root==null)
            return;
        
       
        if(hset.contains(root.val)){
            hset.remove(root.val);
        }else{
            hset.add(root.val);
        }
        
        
        if(root.left==null && root.right==null){
           if(hset.size()<=1)
               count++;
        } else{
            pseudoPalindromicPaths(root.left, new HashSet(hset));
            pseudoPalindromicPaths(root.right, new HashSet(hset));
        }
    }
    
    
}
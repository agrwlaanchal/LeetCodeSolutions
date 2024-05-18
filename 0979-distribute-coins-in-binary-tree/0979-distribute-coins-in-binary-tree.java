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
    private int moves; 
    public int distributeCoins(TreeNode root) {
     
        /*
        if the tree is empty, return.
        Traverse the left subtree: dfs(root.left).
        Traverse the right subtree: dfs(root.right).
        Handle the root.
        */
        moves =0; 
        dfs(root);
        return moves;
        
    }
    
    
    private int dfs(TreeNode root){
        
        if(root==null){
            return 0; 
        }
        
        int leftcoins = dfs(root.left);
        int rightcoins = dfs(root.right);
        
        moves = moves + Math.abs(leftcoins) + Math.abs(rightcoins);
        
        return (root.val-1)+leftcoins+rightcoins; 
        
        
    }
    
}
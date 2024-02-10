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
    public List<Integer> preorderTraversal(TreeNode root) {
       
    List<Integer>  res = new ArrayList<>();
        res = preorder(root, res);
        return res;
    }
    
    List<Integer> preorder(TreeNode root, List<Integer> res){
        
        if(root==null){
            return res;
        }
             res.add(root.val);
            
        if(root.left!=null)
            preorder(root.left, res);
        
       
        if(root.right!=null)
            preorder(root.right,res);
        
        return res;
    }
    
}
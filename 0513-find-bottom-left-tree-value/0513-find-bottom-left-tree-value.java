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
    public int findBottomLeftValue(TreeNode root) {
       
        // do a level order traversal of the tree
        // update result with first value at each level 
        // in the end, you'll have the result with leftmost value of last row 
        
        if(root==null){
            return -1;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int res =0;
        
       res= traverse(q, res);
        return res; 
    }
    
    public int traverse( Queue<TreeNode> q, int res){
        
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            //do level traversal
            
            for(int i=0;i<size;i++){
                
                //store first value of each level in res
                if(i==0){
                res = q.peek().val;
                }
                
                TreeNode temp = q.poll();
            
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            
            
            
        }
        return res; 
        
    }
    
}
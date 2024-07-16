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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        TreeNode lca = findLca(root, startValue,destValue);
        //Initialize pathToStart and pathToDest to store paths from the LCA to the start and destination nodes, respectively.
        
        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();
        
        //Call findPath to determine these paths.
        
        findPath(lca, startValue, pathToStart);
        findPath(lca, destValue, pathToDest);
        
        //Initialize directions to store the final result.
        StringBuilder directions = new StringBuilder();
        
        //Add "U" for each step in pathToStart.
        directions.append("U".repeat(pathToStart.length()));
        
        
        //Append pathToDest to directions.
         directions.append(pathToDest);
        
        return directions.toString(); 
        
    }
    
    
    private boolean findPath(TreeNode root, int target, StringBuilder path){
        
        if(root==null)
            return false;
        
        if(root.val==target)
            return true; 
        
        //try left substree
        path.append("L");
        if(findPath(root.left, target, path)){
            return true;
        }
        
        path.setLength(path.length() - 1); // remove L 
        
        path.append("R");
        if(findPath(root.right, target, path)){
            return true;
        }
        
        path.setLength(path.length() - 1); 
        return false;
        
    }
    
    
    private TreeNode findLca(TreeNode root, int p, int q){
        
        if(root == null || root.val == p || root.val == q) 
            return root;
        
        TreeNode left = findLca(root.left,p,q);
        TreeNode right = findLca(root.right,p,q);

        // result
        if(left == null)
            return right;
        else if(right == null)
            return left;
        else
            return root;
        
    }
    
}
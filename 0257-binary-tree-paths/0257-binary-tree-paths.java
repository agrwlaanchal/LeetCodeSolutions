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
   List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
     
        if(root==null)
            return res;
        
        
        binaryTreePaths(root, "");
        
       
        return res;
    }
    
    public void binaryTreePaths(TreeNode root, String str){
     
         str = str+ "->"+root.val;
    //    System.out.println(str);
        if(root.left==null && root.right==null){
            res.add(str.substring(2));
        }
        
        if(root.left!=null){
            //str = str+"->";
            // System.out.println("left " + str);
            binaryTreePaths(root.left,str);
        }
        
        if(root.right!=null){
        //    str=str+"->";
       //      System.out.println("right "+  str);
            binaryTreePaths(root.right,str);
        }
           
    }
    
}
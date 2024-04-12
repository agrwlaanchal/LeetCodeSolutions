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
     TreeNode t = null;
    TreeNode result  =null;
    public void flatten(TreeNode root) {
      
        if(root==null){
            return ;
        }
        
       
        preorder(root);
     //   print(t);
      //  root=null;
        root.left = null; // Ensure left child is null
        root.right = t.right; 
    }

    public void print(TreeNode t){
        
        if(t!=null){
            System.out.print(t.val+" ,");
            if(t.left==null){
                System.out.print("null ,");
            }else{
            print(t.left);
            }
            
            print(t.right);
        }
        
    }
    
    public void preorder(TreeNode root){
        
        if(root!=null){
            TreeNode temp = new TreeNode(root.val);
            if(result==null){
                result=temp;
                t=result;
            }else{
                result.right = temp; 
                result.left=null;
         //       System.out.println(result.val +" "+result.right.val+" "+result.left);
                result=result.right; 
            }
            preorder(root.left );
            preorder(root.right);
        }
        
        
        
    }
    
}
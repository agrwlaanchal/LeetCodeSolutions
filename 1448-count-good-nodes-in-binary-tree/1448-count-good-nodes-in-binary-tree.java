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
    int res=0;
    public int goodNodes(TreeNode root) {
     
        int[]path=new int[100001];
        
        int pathlength=0; 
        
        if(root==null)
            return 0;
        
       /* res.add(1);//for root
        if(root.left==null && root.right==null){
            return res; 
        }*/
        
        traverseTree(root, path, pathlength);
        
        return res;
    }
    
    
    public void traverseTree(TreeNode root, int[]path, int pathlength){
        
        
     
        if(root!=null){
            
            path[pathlength]=root.val;
            pathlength++;
            
            if(validate(path, pathlength)){
                res++;
     //           System.out.println(root.val+" "+ pathlength);
            }
        }
        
        if(root.left!=null){
            traverseTree(root.left, path,pathlength);
        }
        
        if(root.right!=null){
            traverseTree(root.right, path, pathlength);
        }
        
        
    }
    
    
    boolean validate(int[]path, int pathlength){
        
        
        int compareTo = path[pathlength-1];
       
        for(int i=0; i<=pathlength-2;i++){
            
            if(path[i]>compareTo){
       //         System.out.println("path value to "+path[i]+" "+compareTo);
                return false;
            }
            
        }
        return true;
    }
    
    
    
}
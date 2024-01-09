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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
         preorder(root1, arr1);
        preorder(root2, arr2);
       
      //  System.out.println(arr1.toString());
        if(arr1.size()!=arr2.size())
            return false;
        
        for(int i=0; i<arr1.size(); i++){
            if(arr1.get(i)!=arr2.get(i))
                return false;
        }
        return true; 
        
    }
    
    
    public void preorder(TreeNode root, ArrayList<Integer>arr){
        
        if(root!=null){
            preorder(root.left, arr);
            if(root.left==null && root.right==null)
                arr.add(root.val);
            preorder(root.right, arr);
             
        }
    }
    
}
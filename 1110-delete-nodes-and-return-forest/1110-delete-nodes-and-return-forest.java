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
    
     List<TreeNode>  res;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
       
        //you traverse, the if you find any node which in to_delete, add those children in res list. 
        
        res =new ArrayList<>();
       HashSet<Integer>hset = new HashSet<>();
        for(int num: to_delete){
            hset.add(num);
        }
      
         // If the root is not deleted, add it to the result list
       if (!hset.contains(root.val)) {
            res.add(root);
        }
      
        
        traverse(root, hset);
        return res;
    }
    
    public TreeNode traverse(TreeNode root,   HashSet<Integer> mySet ){
        
        if(root==null){
            return null;
        }
      root.left =  traverse(root.left,mySet);
       root.right= traverse(root.right,mySet); 
        
        if(mySet.contains(root.val)){
            
            if(root.left!=null ){
                res.add(root.left);
            }
            
            if(root.right!=null){
                res.add(root.right); 
            }
            return null;
        }
        
          return root;
        
    }
    
}
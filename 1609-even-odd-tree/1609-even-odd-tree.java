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
    public boolean isEvenOddTree(TreeNode root) {
     
        // level order traversal 
        // check the conditions based on level 
        
        if(root==null){
            return true;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        int level = 0; 
        
        while(!q.isEmpty()){
            
            int size = q.size();
            int[]arr = new int[size];
            for(int i=0 ;i<size; i++){
                
                TreeNode temp= q.poll();
                arr[i] = temp.val;
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
               
                
            }
             if(!check(arr, level)){
                    return false;
                }
            level++;
            
        }
        
        return true; 
        
        
    }
    
    public boolean check(int[]arr, int level){
        
        System.out.println(Arrays.toString(arr));
        System.out.println(level);
        if(level%2==0){
            //check all elements are oddd and increasing 
           
            if(arr[0]%2==0){
                return false;
               
            }
             for(int i=1; i<arr.length ; i++){
                 if(arr[i]%2==0 || arr[i]<=arr[i-1]){
                     return false;
                 }
             }
            
            
        }else{
            
            
            if(arr[0]%2!=0){
                return false;
            }
            for(int i=1; i<arr.length ; i++){
                if(arr[i]%2!=0 || arr[i]>=arr[i-1]){
                    return false;
                }
            }
            
            
        }
        
        return true; 
        
    }
    
}
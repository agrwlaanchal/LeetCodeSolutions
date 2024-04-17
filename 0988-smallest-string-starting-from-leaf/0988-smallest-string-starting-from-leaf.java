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
    PriorityQueue<String> pq ;
    public String smallestFromLeaf(TreeNode root) {
      
        pq = new PriorityQueue<>();
        
        if(root==null){
            return "";
        }
        
        char path[] = new char[1000];
        
        traverse(root,path, 0);
        
        return pq.poll();
        
    }
    
    public void traverse(TreeNode root, char[]path, int pathLen){
        
        if(root==null){
            return;
        }
        
        
        path[pathLen] = (char) (root.val+97);
        pathLen++;
        
        //System.out.println(sb.toString());
        
        if(root.left==null && root.right==null){
            StringBuilder sb = new StringBuilder();
            
            for(int i=pathLen-1; i>=0;i--){
                sb.append(path[i]);
            }
            //System.out.println("adding "+sb.toString());
            pq.add(sb.toString());
            
        }else{
            traverse(root.left, path,pathLen );
            traverse(root.right, path, pathLen);
        }
        
        
        
    }
    
}
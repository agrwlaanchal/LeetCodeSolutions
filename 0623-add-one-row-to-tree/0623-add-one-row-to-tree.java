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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        
        
        if(depth==1 || root==null ){
            TreeNode temp = new TreeNode(val);
            temp.left = root;
            return temp;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int level = 0;
        
        while(!q.isEmpty()){
            
            level++;
           // System.out.println("level is "+level +" "+depth);
            
            int len = q.size();
            for(int i=0; i<len; i++){
                 TreeNode node = q.poll();
                
                if(level==depth-1){
                
                //    System.out.println("level is "+level+" "+node.val );
                          TreeNode temp =new TreeNode(val);
                        temp.left = node.left;
                        node.left = temp;
                    
                        TreeNode temp2 =new TreeNode(val);
                        temp2.right = node.right;
                        node.right = temp2;
                 
                }
                
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                
            }
            if(level==depth-1){
                break;
            }
            
            
        }
        
        
        
        return root; 
        
        
    }
}
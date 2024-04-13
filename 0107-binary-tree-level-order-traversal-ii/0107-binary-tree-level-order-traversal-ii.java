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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>  res = new ArrayList<>();
     
        if(root==null){
            return res;
        }
        Stack<List<Integer>> st = new Stack<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            ArrayList<Integer> arr = new ArrayList<>();
            //System.out.println(q.size());
            int n = q.size();
            for(int i=0; i<n;i++){
                TreeNode temp = q.poll();
                arr.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            st.push(arr);
            
        }
        
        
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res; 
        
        
    }
}
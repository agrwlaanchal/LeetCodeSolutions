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
/*
 pair<int,int> postorder(TreeNode* &root,int sum,int count)
    {
        if(root == 0) return {0,0};

        auto l = postorder(root->left,sum,count);
        auto r = postorder(root->right,sum,count);

        sum = l.first + root->val + r.first;
        count = l.second + 1 + r.second;

        if(sum / count == root->val) ans++;
        return {sum,count};
    }

    int averageOfSubtree(TreeNode* root) {
        postorder(root,0,0);
        return ans;
    }
*/
class Solution {
   
    int res=0; 
    
    public int[]traversal (TreeNode root, int sum, int count){
        
         int[]temp = new int[2];
        
        if(root==null)
        {
           
            temp[1]=0;
            temp[0]=0;
            return temp; 
        }
          
          int[] left = traversal(root.left, sum, count);
          int[]right = traversal(root.right, sum, count);
          
        sum = left[0]+right[0]+root.val;
        count = left[1]+right[1]+1;
        
        
       if(sum/count==root.val)
           res++;
       
        temp[0]=sum;
        temp[1]=count; 
     
        return temp;
    }
    public int averageOfSubtree(TreeNode root) {
        
        traversal(root, 0, 0);
    
        return res; 
        
    }
    
    
     
    
}
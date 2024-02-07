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
    int count ;
     HashMap<Long, Integer> hmap;
    public int pathSum(TreeNode root, int targetSum) {

            hmap = new HashMap<>();
            count=0;
            //hashmap of prefixsum and count 
            // once we check conditions for that prefix sum
            //decrease count by 1. 
            long prefixsum =0;

            traverse(root , prefixsum, targetSum);
            return count;


    }


    public void traverse(TreeNode root, long prefixsum,  int target){

        if(root==null){
            return ;
        }

        prefixsum = prefixsum + root.val;

        if(hmap.containsKey(prefixsum-target)){
            count=count+hmap.get(prefixsum-target);
        }

        if(prefixsum==target){
            count++;
        }

      
        if(hmap.containsKey(prefixsum)){
            hmap.put(prefixsum, hmap.get(prefixsum)+1);
        }else{
            hmap.put(prefixsum, 1);
        }

       
            traverse(root.left, prefixsum, target);
        
        
            traverse(root.right, prefixsum, target);
        

        //remove it now. 
        hmap.put(prefixsum, hmap.get(prefixsum)-1);

    }



}
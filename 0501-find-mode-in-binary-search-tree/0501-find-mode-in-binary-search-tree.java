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
    int maxfreq = 0;
    public int[] findMode(TreeNode root) {
       
       HashMap<Integer, Integer> hmap = new HashMap<>();
    //    int maxfreq = 0;
        
        traverse(root, hmap);
        
        ArrayList<Integer > res = new ArrayList<>();
      //  System.out.println(maxfreq);
        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
       // System.out.println(entry.getKey() + " "+entry.getValue());
            if(entry.getValue()==maxfreq)
                res.add(entry.getKey());
        }
        
        int []result = new int[res.size()];
        for(int i=0; i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;
        
    }
    
    public void traverse(TreeNode root, HashMap<Integer, Integer> hmap){
        
        
        if(root!=null){
            if(hmap.containsKey(root.val)){
                hmap.put(root.val, hmap.get(root.val)+1);
            }else{
                hmap.put(root.val,1);
            }
            if(hmap.get(root.val)>maxfreq)
                maxfreq=hmap.get(root.val);
            
            traverse(root.left, hmap);
            traverse(root.right, hmap);
        }
        
    }
    
}
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
    public int amountOfTime(TreeNode root, int start) {
     
        
        HashMap<Integer, HashSet<Integer> > hmap = new HashMap<>();
        convert(root, 0, hmap);
        
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        int min =0 ;
        HashSet<Integer> visited = new HashSet<>();
        visited.add(start);
        
        while(!q.isEmpty()){
            int level = q.size();
            
            while(level>0){
                int current = q.poll();
                for(int num: hmap.get(current)){
                    if(!visited.contains(num)){
                        visited.add(num);
                        q.add(num);
                    }
                }
                level--;
            }
            min++;
        }
        
        return min-1;
        
        
        
    }
    
    
 
    
    public void convert(TreeNode current,int parent, HashMap<Integer, HashSet<Integer> >hmap ){
        
        
        if(current==null)
            return ;
        
        
        if(!hmap.containsKey(current.val)){
            hmap.put(current.val, new HashSet<>());
        }
        
        HashSet<Integer> adjlist = hmap.get(current.val);
        
        if(parent!=0)
            adjlist.add(parent);
        
        if(current.left!=null){
            adjlist.add(current.left.val);
        }
        
        if(current.right!=null){
            adjlist.add(current.right.val);
        }
        
        convert(current.left, current.val, hmap);
        convert(current.right, current.val, hmap);
        
        
        
        
        
        
    }
    
    
    
}
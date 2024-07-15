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
    public TreeNode createBinaryTree(int[][] descriptions) {
      
        //create two hashmap 
        // parent 
        // node [left, right]
        
        HashMap<Integer, Integer> hmap = new HashMap<>(); // node and it's parent
        // any node where parent is -1, root node 
        // make array using it  
        
        HashMap<Integer, int[]> nodeMap = new HashMap<>();
        
        HashSet<Integer> keySet= new HashSet<>();
        
        for(int arr[]:descriptions ){
            
            hmap.put(arr[1], arr[0]);
            keySet.add(arr[1]);
            keySet.add(arr[0]);
            
            if(nodeMap.containsKey(arr[0])){
                
                if(arr[2]==1){
                    int[] temp  = nodeMap.get(arr[0]);
                    temp[0]=arr[1];
                    nodeMap.put(arr[0], temp);
                }else{
                    int[] temp  = nodeMap.get(arr[0]);
                    temp[1]=arr[1];
                    nodeMap.put(arr[0], temp);
                }
                
            }else{
                
                if(arr[2]==1){
                    int[] temp  = new int[2];
                     temp[0]=arr[1];
                     temp[1]=-1;
                      nodeMap.put(arr[0], temp);
                        
                    }else{
                        int[] temp  =new int[2];
                        temp[1]=arr[1];
                        temp[0]=-1;
                         nodeMap.put(arr[0], temp);
                    }
                
            }
            
            
            
        }
        
        int rootval = -1;
        
        for(int key: keySet){
            if(!hmap.containsKey(key)){
                rootval=key;
                break;
            }
        }
        
        
        TreeNode root = new TreeNode(rootval);
        
        createTree(root, nodeMap);
        
       return root;     
    }
    
    
    public void createTree(TreeNode root, HashMap<Integer, int[]> nodeMap){
        
        if(!nodeMap.containsKey(root.val))
            return ; 
        
       // System.out.println(root.val);
        int[]arr= nodeMap.get(root.val);
        
        if(arr[0]!=-1){
            //left child 
            root.left = new TreeNode(arr[0]);
            
        }
        if(arr[1]!=-1){
            root.right=new TreeNode(arr[1]);
        }
        
        if(root.left!=null)
        createTree(root.left, nodeMap);
        
        if(root.right!=null)
        createTree(root.right, nodeMap);
        
        
    }
    
    
}
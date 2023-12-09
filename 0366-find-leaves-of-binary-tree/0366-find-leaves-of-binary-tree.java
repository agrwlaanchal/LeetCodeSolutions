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

 

        public void printTree(TreeNode root){

            if(root==null){
                System.out.println("root null");
                return;
            }

            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);

        }

    public List<List<Integer>> findLeaves(TreeNode root) {
        

        List<List<Integer>> resList = new ArrayList<>();

        while(root.left!=null || root.right!=null){

               List<Integer> res = new ArrayList<>();

                TreeNode newHead = root;
                res = findleaves(root,res);
            resList.add(res);
            
         
        }

      List<Integer> res = new ArrayList<>();
      res.add(root.val);
        resList.add(res);

        return resList;

    }


  public  List<Integer>  findleaves(TreeNode root ,  List<Integer> res)
    {

            if(root==null){
                return null;
            }

        //    System.out.println("checking for "+root.val);

            if(root.left!=null){

                // check child 
                TreeNode temp = root.left;

//                System.out.println(root.left.val);
                if(temp.left==null && temp.right==null){
                    res.add(temp.val);
                    root.left=null;
                } else{
                 
                    findleaves(temp,res);
                }
                
            }

             if(root.right!=null){

                    TreeNode temp = root.right;

                     if(temp.left==null && temp.right==null){
                    res.add(temp.val);
                    root.right=null;
                } else{
                    findleaves(temp,res);
                }

                }


            
                  
            return res;
    }

}
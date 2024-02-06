/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        int max = Integer.MIN_VALUE;

        if (root == null)
            return 0;

        q.add(root);

        return traverse(q, max);

    }

    public int traverse(Queue<TreeNode> q, int max) {
        int level = 0;
        int res = 0;
        while (!q.isEmpty()) {
            level++;
            int size = q.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                // System.out.println(temp.val);

                sum = sum + temp.val;

                // System.out.println("sum is "+sum);
                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);

            }
            if (sum > max) {
                max = sum;
                res = level;
            }

        }

        return res;

    }

}
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int maxWidth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> indices = new LinkedList<>();
        
        queue.offer(root);
        indices.offer(1); // Root is at position 1
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = 0; // Initialize start index for current level
            int end = 0;   // Initialize end index for current level
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = indices.poll();
                
                if (i == 0) {
                    start = index; // Update start index for current level
                }
                if (i == size - 1) {
                    end = index;   // Update end index for current level
                }
                
                if (node.left != null) {
                    queue.offer(node.left);
                    indices.offer(index * 2); // Calculate position for left child
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    indices.offer(index * 2 + 1); // Calculate position for right child
                }
            }
            
            maxWidth = Math.max(maxWidth, end - start + 1); // Update maximum width
        }
        
        return maxWidth;
    }
}

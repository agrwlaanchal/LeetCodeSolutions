/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][]res = new int[m][n];
        for(int i=0;i<m; i++){
            Arrays.fill(res[i],-1);
        }
        
        if(head==null)
            return res;
        
        ListNode temp =head;
      int top = 0, bottom = m - 1, left = 0,
            right = n - 1;

        // Iterate until all elements are printed
        while (top <= bottom && left <= right) {
            // Print top row from left to right
            for (int i = left; i <= right; ++i) {
                if(temp!=null){
                    res[top][i]=temp.val;
                    temp=temp.next;
                }else{
                    return res; 
                }
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; ++i) {
                if(temp!=null){
                    res[i][right]=temp.val;
                    temp=temp.next;
                }else{
                    return res; 
                }
            }
            right--;

            // Print bottom row from right to left (if
            // exists)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    if(temp!=null){
                    res[bottom][i]=temp.val;
                    temp=temp.next;
                }else{
                    return res; 
                }
                }
                bottom--;
            }

            // Print left column from bottom to top (if
            // exists)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                     if(temp!=null){
                    res[i][left]=temp.val;
                    temp=temp.next;
                }else{
                    return res; 
                }
                }
                left++;
            }
        }
        
        return res;
        
        
        
        
    }
}
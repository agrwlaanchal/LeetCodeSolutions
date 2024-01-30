class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
     
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int res = 0;
        for(int i=0, j=nums2.length-1; i<nums1.length;i++,j--){
            res= res+nums1[i]*nums2[j];
        }
        return res; 
    }
}
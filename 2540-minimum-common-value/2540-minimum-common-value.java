class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
     
        //traverse the arrays until we get a common
        // move the smaller values in array 
        // return -1 if nothing is common     
        
       int index1 =0; 
        int index2 = 0;
        
        while(index1<nums1.length && index2<nums2.length){
            
             if(nums1[index1]<nums2[index2]){
                index1++;
            }else if(nums1[index1]>nums2[index2]){
                index2++;
            }else{
                return nums1[index1];
            }
            
        }
        
        return -1 ; 
    }
}
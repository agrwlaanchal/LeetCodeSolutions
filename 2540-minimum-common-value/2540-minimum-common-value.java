class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
     
        //traverse the arrays until we get a common
        // move the smaller values in array 
        // keep initial res as -1;
        
        
        
        
     /*   int index1 =0; 
        int index2 = 0;
        
        while(index1<nums1.length && index2<nums2.length){
            
            if(nums1[index1]==nums2[index2]){
                return nums1[index1];
            }else if(nums1[index1]<nums2[index2]){
                index1++;
            }else{
                index2++;
            }
            
        }
        
        return -1 ; */
        
        
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            hset.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length; i++){
            if(hset.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
        
    }
}
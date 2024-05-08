class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
        
       int[]res = new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            
            int num = nums1[i];
            res[i] = findgreater(num, nums2);
            
        }
        return res;
        
        
    }
    
    
    public int findgreater(int num, int[]nums2){
        
        int i=0;
        while(i<nums2.length && nums2[i]!=num){
            i++;
        }
     //   System.out.println("index is "+i);
        if(i==nums2.length-1){
            return -1;
        }
        i++;
        while(i<nums2.length){
            if(nums2[i]>num){
                return nums2[i];
            }
            i++;
        }
        return -1;
        
    }
    
}
class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
     
     
        int sublen =0;
        if(nums.length%2==0){
            sublen = nums.length-1;
        }else{
            sublen = nums.length;
        }
        
        
        int length=1;
        int res =0 ;
        while(length<=sublen){
            
           
            for(int i=0;i<nums.length;i++){
                
                if(i+length<=nums.length){
                     int sum =nums[i];
                for(int j=i+1; j<i+length ;j++){
                    sum=sum+nums[j];
                }
                    res=res+sum;
                }
                
            }
            length=length+2;
            
        }
        return res;
        
        
    }
}
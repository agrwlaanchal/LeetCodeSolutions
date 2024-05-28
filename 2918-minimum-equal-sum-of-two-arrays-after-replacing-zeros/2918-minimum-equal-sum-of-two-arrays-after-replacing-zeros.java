class Solution {
    public long minSum(int[] nums1, int[] nums2) {
       
        long sum1 =0;
        long num10 = 0;
        
        long sum2 =0;
        long num20=0;
        
        for(int i=0;i<nums1.length;i++){
            
            if(nums1[i]==0){
                num10++;
            }else{
               sum1=sum1+nums1[i]; 
            }
        }
        
        
        for(int i=0;i<nums2.length;i++){
            
            if(nums2[i]==0){
                num20++;
            }else{
               sum2=sum2+nums2[i]; 
            }
        }
      
      //  System.out.println(sum1+" "+num10);
        //System.out.println(sum2+" "+num20);
        
        if(num10==0 && num20==0){
            if(sum1==sum2){
                return sum1;
            }else{
                return -1;
            }
        }
        
       if(num10>num20){
           //try to make it work for num10 
           
           long neededsum = sum1+num10;
           
           if(neededsum<=sum2){
               return sum2+num20;
           }else{
                 if(num20>0){
                     return Math.max(neededsum, sum2+num20);
                 }else{
                     return -1; 
                 }   
           }
           
           
       }else{
           
           long neededsum = sum2+num20;
               
       if(neededsum<=sum1){
               return sum1+num10;
           }else{
                 if(num10>0){
                     return Math.max(neededsum, sum1+num10);
                 }else{
                     return -1; 
                 }   
           }
       }
        
    }
}
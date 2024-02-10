class Solution {
    public int longestOnes(int[] nums, int k) {
     
     //o, k--, k>0 , k==0, stop 
     //
     int left=0; 
     int right;  
   int max =0 ;
     for(right=0; right<nums.length; right++){

         if(nums[right]==0){
             k--;
         }
         while(k<0){
             //move left
             while(nums[left]!=0){
                 left++;
             }
             left++;
             k++;
         }
       // System.out.println(left+" "+right);
         max= Math.max(max, right-left+1);


     }
     return max; 

    }
}
class Solution {
    public int longestSubarray(int[] nums) {

     int k=1;


        int left=0;
        int right;
        int len = 0;
        int max =0;
        boolean flag=true;
        for(right=0;right<nums.length;right++){

                if(nums[right]==1){
                   
                    len++;
                //     System.out.println("going here "+len);
                }else {
                    flag=false;
                    k--;
                   // System.out.println("k is "+k);
                    if(k<0){
                        while(nums[left]!=0){
                            left++;
                        }
                      
                        k++;
                        left++;
                    //      System.out.println("left is "+left +" and k is "+k);
                        len = right-(left);
                    //    System.out.println("len is "+len);
                    }
                   // System.out.println("length is "+len);
                }

        max=Math.max(max, len);


        }
        if(flag==true)
        return max-1;
        return max; 

    }
}
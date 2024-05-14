


class Solution {
    public int rob(int[] nums) {
        
      
        if(nums.length==1){
            return nums[0];
        }
        
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        
        //create two arrays 
        // 1. with 0-> second last element 
        // 2. from 1-> last element 
        
        int[]temp = new int[nums.length-1];
        int []temp1 = new int[nums.length-1];
        
        for(int i=0;i<nums.length-1; i++){
            temp[i]=nums[i];
        }
         
       // System.out.println(Arrays.toString(temp));
        for(int i=1;i<nums.length; i++){
            temp1[i-1]=nums[i];
        }
        
       //  System.out.println(Arrays.toString(temp1));
        //find max 
        int res[] = new int[temp.length];
        res[0]=temp[0];
        res[1]=Math.max(temp[0], temp[1]);
        
        for(int i=2; i<res.length;i++){
            res[i] = Math.max(res[i-2]+temp[i], res[i-1]);    
        }
      //   System.out.println(Arrays.toString(res));
        int max=res[res.length-1];
        //System.out.println(max);
        res = new int[temp.length];
        res[0]=temp1[0];
          res[1]=Math.max(temp1[0], temp1[1]);
        //res[1]=temp1[1];
        for(int i=2; i<res.length;i++){
            res[i] = Math.max(res[i-2]+temp1[i], res[i-1]);    
        }
      //  System.out.println(Arrays.toString(res));
        
        return Math.max(max, res[res.length-1]);
        
        
        
    }
}
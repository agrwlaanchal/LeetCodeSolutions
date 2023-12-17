class Solution {
    public long minimumCost(int[] nums) {
    
        
        //find mid of nums 
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        
        int palindrome1 = palindromeleft(mid);
        int palindrome2 = palindromeright(mid);
        
        
        if(palindrome1==palindrome2)
            return sumwith(palindrome1, nums);
        
      //  System.out.println(palindrome1 +" "+palindrome2);
        
        long sum1 = sumwith(palindrome1, nums);
        long sum2 = sumwith(palindrome2, nums);
        
       // System.out.println("sum1 "+sum1+" "+sum2);
        
        if(sum1<sum2)
            return sum1;
        else
            return sum2; 
        
        
        
    }
    
    
    public long sumwith(int target, int[]nums){
        
        long sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum=sum+Math.abs(target-nums[i]);
        }
        
        return sum; 
        
    }
    
    public int palindromeleft(int num){
        
        
        while(!check(num)){
            num--;
        }
        
        return num;
        
        
    }
    
    
     public int palindromeright(int num){
        
        
        while(!check(num)){
            num++;
        }
        
        return num;
           
    }
    
    public boolean check(int num){
        
        int temp=0;
        
        int res = num; 
        while(num>0){
            temp=temp*10+num%10;
            num=num/10;
        }
      //  System.out.println("temp is "+temp+" num is "+num);
        
        if(temp==res)
            return true;
        
        return false;
        
        
        
    }
    
    
    
    
    
    
    
}
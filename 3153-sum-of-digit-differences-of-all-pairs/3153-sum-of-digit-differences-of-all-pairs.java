class Solution {
    public long sumDigitDifferences(int[] nums) {
     
        
        //count no of digits. 
        int temp = nums[0];
        int count =0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        
        long res =0; 
        for(int i=0; i<count; i++){
           HashMap<Integer,Integer> temparr = new HashMap<>();
            for(int j=0;j<nums.length;j++){
                int digit = nums[j]%10;
                temparr.put(digit, temparr.getOrDefault(digit,0)+1);
                nums[j]=nums[j]/10;
            }
            for(Map.Entry<Integer, Integer>entry: temparr.entrySet()){
                res=res+entry.getValue()*(nums.length-entry.getValue());
            }
        }
        
        return res/2;
        
        
        
        
    }
    
   
    
}
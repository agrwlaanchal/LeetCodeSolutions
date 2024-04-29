class Solution {
    public int minOperations(int[] nums, int k) {
     
        
        int xor_arr = 0;
     
        
        for (int i = 0; i < nums.length; i++) {
     
            // Find XOR with the result
            xor_arr = xor_arr ^ nums[i];
        }
        
       // System.out.println(xor_arr +" "+Integer.toBinaryString(xor_arr)+" "+ Integer.toBinaryString(k)+" "+k);
        String temp = ""+Integer.toBinaryString(xor_arr);
        
          String num = ""+Integer.toBinaryString(k);
       
        
       if(temp.length()<num.length()){
           
           while(temp.length()!=num.length()){
               temp="0"+temp;
           }
           
       }else{
           while(num.length()!=temp.length()){
               num="0"+num;
           } 
       }
        
        
        int count =0;
        for(int i=temp.length()-1;i>=0;i--){
            if(temp.charAt(i)!=num.charAt(i)){
                count++;
            }
        }
        return count; 
        
        
        
        
        
    }
}
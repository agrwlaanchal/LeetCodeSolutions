class Solution {
    public int hammingDistance(int x, int y) {
       
        String num1 = Integer.toBinaryString(x);
        String num2 = Integer.toBinaryString(y);
        
        
        while(num1.length()<num2.length()){
            num1= "0"+num1;
        }
        
        while(num1.length()>num2.length()){
            num2= "0"+num2;
        }
        int res =0;
        for(int i=0;i<num1.length();i++){
            
            char c = num1.charAt(i);
            char t = num2.charAt(i);
            
            if(c!=t){
                res++;
            }
            
        }
        return res;
        
        
    }
}
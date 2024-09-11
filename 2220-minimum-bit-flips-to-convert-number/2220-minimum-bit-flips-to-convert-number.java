class Solution {
    public int minBitFlips(int start, int goal) {
        
        int num = start^goal;
        
        String s = Integer.toBinaryString(num);
        
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        
        return count; 
        
        
    }
}
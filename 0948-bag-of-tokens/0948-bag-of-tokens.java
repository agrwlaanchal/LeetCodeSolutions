class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        if(tokens.length==0){
            return 0; 
        }
        
        Arrays.sort(tokens);
        
        if(power<tokens[0]){
            return 0; 
        }
        int start =0;
        int end = tokens.length-1;
        int count=0;
        while(start<end){
            
            if(power>=tokens[start]){
                power=power-tokens[start];
                count++;
                start++;
            }else if(count>=1){
                power=power+tokens[end];
                count--;
                end--;
            }else{
                break;
            }
            
            
        }
        
        
        if(start==end){
            if(power>=tokens[start]){
                count++;
            }
        }
        
        return count; 
        
    }
}
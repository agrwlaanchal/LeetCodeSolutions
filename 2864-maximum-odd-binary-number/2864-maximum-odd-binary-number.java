class Solution {
    public String maximumOddBinaryNumber(String s) {
     
        
        //count number of 1s
        int count1 = 0;
        int count0 = 0;
        int len = s.length()-1;
        
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='1'){
                count1++;
            }else{
                count0++;
            }
        }
        
        String res= "";
        if(count1==0){
            
            for(int i=0;i<count0;i++){
                res=res+'0';
            }
            return res;     
        }
        
        
        for(int i=0;i<count1-1;i++){
            res=res+"1";
        }
        
        for(int i=0;i<count0;i++){
                res=res+'0';
        }
        
        res=res+"1";
        return res; 
        
        
        
        
        
    }
}
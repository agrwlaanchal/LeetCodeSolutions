class Solution {
    public int romanToInt(String s) {
     
        int res =0 ;
        
        
        for(int i=0;i<s.length();i++){
            
            char c  = s.charAt(i);
            if(c=='M')
            {
                res = res+1000;
            }else if(c=='D'){
                res=res+500;
            }else if(c=='C'){
                 if(i+1<s.length()&&s.charAt(i+1)=='D'){
                    res=res+400;
                    i++;
                }else if(i+1<s.length()&&s.charAt(i+1)=='M'){
                    res=res+900;
                    i++;
                }else{
                    res=res+100;
                }
                
                
            }else if(c=='L'){
                res=res+50;
            }else if(c=='X'){
                
                 if(i+1<s.length()&&s.charAt(i+1)=='L'){
                    res=res+40;
                    i++;
                }else if(i+1<s.length()&&s.charAt(i+1)=='C'){
                    res=res+90;
                    i++;
                }else{
                    res=res+10;
                }
               
            }else if(c=='V'){
                res=res+5;
            }else{
                
                if(i+1<s.length()&&s.charAt(i+1)=='V'){
                    res=res+4;
                    i++;
                }else if(i+1<s.length()&&s.charAt(i+1)=='X'){
                    res=res+9;
                    i++;
                }else{
                    res=res+1;
                }
                
                
            }
            
            
        }
        
        return res;
        
        
        
        
    }
}
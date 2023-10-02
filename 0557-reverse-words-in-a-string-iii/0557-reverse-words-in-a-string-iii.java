class Solution {
    public String reverseWords(String s) {
        
     
        String temp ="";
        String resString = "";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!=' '){
                temp=temp+s.charAt(i);
            }else{
                //we got a string
                resString=resString+reverse(temp)+" ";
                temp="";
            }
            
        }
        
        
        resString=resString+reverse(temp);
        return resString;
            
        }
    
    
  
    public String reverse(String str){
        String res ="";
        for(int i=str.length()-1; i>=0;i--)
            res=res+str.charAt(i);
        return res;
    }
    
        
    
    
}
class Solution {
    public int minimumLength(String s) {
     
        int start =0 ;
        int end = s.length()-1;
        
        
        while(start<end){
            
            char c = s.charAt(start);
        //    System.out.println(c+" "+start+" "+end+" "+s.substring(start, end+1));
            if(s.charAt(start)==s.charAt(end)){
                while(start<s.length() &&  s.charAt(start)==c ){
                    
                    start++;
                }
                while(end>0 && s.charAt(end)==c){
                    
                    end--;
                }
            }else{
               return end-start+1;
            }
            
        }
     //   System.out.println(start+" "+end + s.substring(start, end+1));
        if(start==end){
            return 1; 
        }else if(start>end){
            return 0; 
        }
        
        return end-start+1; 
        
        
    }
}
class Solution {
    public int minLength(String s) {
     
            while(s.indexOf("AB")!=-1 || s.indexOf("CD")!=-1){
                
                int index = s.indexOf("AB");
                if(index!=-1){
                StringBuilder temp = new StringBuilder(s.substring(0, index));
                if(index+2<s.length());
                temp.append(s.substring(index+2));
                     s = temp.toString();
                } 
               
              
                index = s.indexOf("CD");
                if(index!=-1){
               StringBuilder  temp = new StringBuilder();
                 temp.append(s.substring(0, index));
                if(index+2<s.length());
                temp.append(s.substring(index+2));
               
                s=temp.toString();
                }
            }
        
        
        return s.length();
        
    }
}
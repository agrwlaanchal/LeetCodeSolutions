class Solution {
    public String compressedString(String word) {
     
        if(word.length()==0){
            return word; 
        }
       
        String comp ="";
        
        int count=1;
        char ch = word.charAt(0);
        
        int index = 1;
        
        while(index<word.length()){
            
            if(ch==word.charAt(index)&&count<9){
                count++;
                index++;
            }else{
                comp=comp+count+ch;
                ch=word.charAt(index);
                index++;
                count=1;
            }
        }
        
       comp=comp+count+ch;
          
        
        return comp; 
        
    }
}
class Solution {
    public int maxDepth(String s) {
       
        int res =0;
        
        int counter =0;
        
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                counter++;
                res= Math.max(res, counter);
            }else if(c==')'){
                counter--;
            }
        }
        return res; 
        
    }
}
class Solution {
    public int scoreOfString(String s) {
       
        int res= 0;
        int a = s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
           
            char b = s.charAt(i);
            
            res=res+Math.abs(b-a);
            a=b;
            
        }
        return res;
    }
}
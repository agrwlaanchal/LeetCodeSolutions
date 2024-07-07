class Solution {
    public List<String> validStrings(int n) {
      
        ArrayList<String> temp = new ArrayList<>();
        
        temp.add("0");
        temp.add("1");
        if(n==1){
            return temp;
        }
        
        
        for(int i=2; i<=n;i++){
            ArrayList<String>  newTemp = new ArrayList<>();
            for(String s: temp){
                
                int len = s.length();
                char c = s.charAt(len-1);
                if(c=='0'){
                    newTemp.add(s+"1");
                }else{
                    newTemp.add(s+"0");
                    newTemp.add(s+"1");
                }
                
            }
            
            temp=newTemp;
        }
        
        return temp;
        
    }
}
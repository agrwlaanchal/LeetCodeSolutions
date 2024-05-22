class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>>  res = new ArrayList<>();
        List<String> subset = new ArrayList<>();
        int index =0;
        calsub(s, subset,res, 0);
        return res; 
        
    }
    
    public void calsub(String num,List<String> subset ,  List<List<String>>  res, int index){
        
      //  res.add(new ArrayList<>(subset));
         
        if(index==num.length()){
            res.add(new ArrayList<String>(subset));
        }
        String temp = "";
        for(int i=index; i<num.length();i++){
            
            temp=temp+num.charAt(i);
            if(ispalin(temp)){
            subset.add(temp);
            calsub(num, subset, res, i+1);
            
            subset.remove(subset.size()-1);
            }
            
        }
        
        
    }
    
    public boolean ispalin(String temp){
        int start =0;
        int end = temp.length()-1;
        
        while(start<=end)
        {
            if(temp.charAt(start)!=temp.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true; 
        
    }
    
    
    
}
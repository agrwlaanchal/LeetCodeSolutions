class Solution {
    public String convertDateToBinary(String date) {
        
       
        
        
        String[] dates =date.split("-");
        StringBuilder res = new  StringBuilder();
        for(int i=0;i<dates.length;i++){
            res.append(Integer.toBinaryString(Integer.valueOf(dates[i]))+"-");
        }
        
        return res.substring(0, res.length()-1);
        
    }
}
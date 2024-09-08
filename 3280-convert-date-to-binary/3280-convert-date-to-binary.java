class Solution {
    public String convertDateToBinary(String date) {
        
        //Integer.toBinaryString(num)
        
        
        String[] dates =date.split("-");
        String res = "";
        for(int i=0;i<dates.length;i++){
            res=res+Integer.toBinaryString(Integer.valueOf(dates[i]))+"-";
        }
        
        return res.substring(0, res.length()-1);
        
    }
}
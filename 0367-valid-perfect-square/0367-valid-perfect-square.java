class Solution {
    public boolean isPerfectSquare(int num) {
     
        double val = Math.sqrt(num);
    if(val%1==0)
        return true;
        else
            return false;
        
    }
}
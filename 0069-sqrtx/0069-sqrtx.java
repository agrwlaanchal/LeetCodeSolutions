class Solution {
    public int mySqrt(int x) {
 
        
        if(x==0||x==1)
            return x;
    int start=1;
        int end = x;
        int res =-1;
        /*
        if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        */
        while(start<=end){
            
            int mid = start + (end - start) / 2;
            
          //  System.out.println(mid*mid +" "+x);
            
            if((long)mid*mid==(long)x){
                return mid;
            }else if((long)mid*mid<x){
                res=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
            
            
        }
        return res;
        
    }
}
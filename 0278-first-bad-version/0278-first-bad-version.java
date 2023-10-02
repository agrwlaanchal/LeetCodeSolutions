/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        
       
        int start = 1;
        int end = n;
        int res = -1;
        while(start <=end ){
            
            int mid = start+ (end-start)/2;
            
           if (isBadVersion(mid) && !isBadVersion(mid-1)){
              return mid;
           }else if(!isBadVersion(mid))
            {
               start = mid + 1 ; 
               
                
            }
            else
            {
                end=mid;
            }
        }
        return res; 
        
    }
}

//2126753390
//1702766719


 
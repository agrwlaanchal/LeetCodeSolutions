class Solution {
    public int climbStairs(int n) {
     
        
        
        if(n<=0)
            return 0;
        
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 3;
        
         int[] arr = new int[n];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
       
        for(int i=3; i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        
        return arr[n-1];
        
    }
}
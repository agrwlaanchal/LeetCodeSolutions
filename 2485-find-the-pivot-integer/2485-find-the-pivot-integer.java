class Solution {
    public int pivotInteger(int n) {
     
        
        int sum  = n*(n+1)/2;
        
      //  System.out.println("sum is "+sum);
        
        int temp =0; 
        for(int i=1; i<=n;i++){
            temp=temp+i;
           
       //     System.out.println(sum+" "+temp);
            if(sum==temp){
                return i;
            }
           sum=sum-i;
        }
        return -1;
        
    }
}
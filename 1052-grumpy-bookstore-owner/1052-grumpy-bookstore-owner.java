class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
     
        int n = customers.length;
        int postsum[] = new int[n];
        int presum[] = new int[n];
        presum[0]=0;
        if(grumpy[0]==0){
            presum[0] = customers[0];
        }
        
        for(int i=1;i<n;i++){
            presum[i]=presum[i-1];
            if(grumpy[i]==0){
                presum[i]+=customers[i];
            }
        }
        
        postsum[n-1]=0;
        if(grumpy[n-1]==0){
            postsum[n-1] = customers[n-1];
        }
        
        for(int i=n-2;i>=0;i--){
            postsum[i] = postsum[i+1];
            if(grumpy[i]==0){
                postsum[i]+=customers[i];
            }
        }
        
        
        int start =0;
        int end = minutes-1;
        int res =0; 
        while(end<n){
            int sum =0;
            for(int i=start;i<=end;i++){
                sum=sum+customers[i];
            }
            
            if(start-1>=0){
                sum=sum+presum[start-1];
            }
            if(end+1<n){
                sum=sum+postsum[end+1];
            }
            
            res=Math.max(res, sum);
            start++;
            end++;
        }
       
        return res; 
        
    }
}
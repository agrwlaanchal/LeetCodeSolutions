class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
     
        int n = customers.length;
        int res =0;
        for(int i=0;i<minutes;i++){
            res+=customers[i];
        }
        //start to substract
        //end to add. 
        // 
        
         int postsum[] = new int[n];
       
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
        int end =-1;
        if(minutes<n)
         end=minutes;
        else{
        //    end = n-1;
        return res;
        }
        int temp = res;
        res=res+postsum[end];
       
        while(end+1<n){
            
            temp=temp-(customers[start]*grumpy[start])+customers[end];
            if(end+1<n)
            res=Math.max(res, temp+postsum[end+1]);
            
            start++;
            end++;
        }

         temp=temp-(customers[start]*grumpy[start])+customers[end];
         res=Math.max(res, temp);
             return res;
        
        
    }
}
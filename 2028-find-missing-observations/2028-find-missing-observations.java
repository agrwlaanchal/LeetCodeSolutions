class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = 0;
        for(int roll: rolls){
            sum=sum+roll;
        }
        
        int diff = mean*(rolls.length+n) - sum;
        
    //    System.out.println("initial diff is "+diff);
        
        if(diff<n)
            return new int[0];
        
        if(diff>n*6){
            return new int[0];
        }
        
        int[]res = new int[n];
        Arrays.fill(res,1);
    
         diff=diff-n;
    //    System.out.println("diff is "+diff);
      //  System.out.println(Arrays.toString(res));
        
        while(diff>0){
          for(int i=0;i<n;i++){
            if(diff<=0){
                break;
            }
            res[i]++;
            diff--;
        // System.out.println("diff is "+diff);
        //System.out.println(Arrays.toString(res));
        }  
            
        }
        
        return res; 
        
    }
}
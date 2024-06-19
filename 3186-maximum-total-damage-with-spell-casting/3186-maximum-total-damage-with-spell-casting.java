class Solution {
    public long maximumTotalDamage(int[] pow) { 
        Arrays.sort(pow);
     
        TreeMap<Long, Long> tmap = new TreeMap<>();

        for (int num : pow) {
            tmap.put((long)num, tmap.getOrDefault((long)num, 0L) + 1L);
        }
        
     /*   TreeMap<Integer,Long> tmap = new TreeMap<>();
       
        for(int num:pow){
            tmap.put(num, tmap.getOrDefault(num, 0L)+1);
            
        }*/
        
        Set<Long> set = tmap.keySet();
        
        long[]power =new long[set.size()];
        int index =0; 
        for(long t: set){
            power[index] = t;
            index++;
        }
        long[]dp = new long[set.size()];
        
        dp[0] = tmap.get(power[0])*power[0];
        long res = dp[0];
        for(int i=1;i<power.length;i++){
        //    System.out.println("power is "+power[i]);
            int count=0;
            int j=i-1;
            long temp = 0;
            while(j>=0&&count<4){
                
                if(power[j]==power[i]-2 || power[j]==power[i]-1){
                    temp=Math.max(temp, dp[j]);
                }else{
                    temp=Math.max(temp, dp[j]+power[i]*tmap.get(power[i]));
                }
                j--;
                count++;
            }
            temp = Math.max(temp, power[i]*tmap.get(power[i]));
         //   System.out.println("temp is "+temp);
            dp[i]=temp;
            res=Math.max(dp[i],res);
        }
        return res;
        
    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int count =0;
        HashSet<Integer>hset = new HashSet<>();
        int[]res = new int[2];
        
        for(int num:nums){
            if(hset.contains(num)){
                if(count==0){
                    res[0]=num;
                    count++;
                }else{
                    res[1]=num;
                    return res;
                }
            }
            hset.add(num);
            
        }
        return res;
       
        
    }
}
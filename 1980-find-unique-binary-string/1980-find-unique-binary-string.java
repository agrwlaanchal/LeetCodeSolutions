class Solution {
    public String findDifferentBinaryString(String[] nums) {
     
        int len  = nums[0].length();
        
        
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("0");
        pq.add("1");
        
        
        while(!pq.isEmpty()){
            
            String temp = pq.poll();
         //   System.out.println("temp is "+temp);
            if(temp.length()==len && find(nums, temp)==false){
                return temp;
            }else if(temp.length()>len){
                continue;
            }
            else{
                String str1=temp+"0";
                pq.add(str1);
                String str2 = temp+"1";
                pq.add(str2);
            }
            
            
            
        }
        
    return null;    
    }
    
    public boolean find(String[]nums, String temp){
        
        
        for(String s: nums){
            if(s.equals(temp)){
                return true;
            }
        }
        return false;
    }
    
    
}
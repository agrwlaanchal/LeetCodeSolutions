class Solution {
   int max =0; 
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
       
        
        int[]arr  =new int[26];
        Arrays.fill(arr,0);
        HashMap<String, Integer> hmap = new HashMap<>();
        for(char c: letters){
            arr[c-'a']++;
        }
        
        List<String> subset = new ArrayList<>();
        int index =0;
         calsub(words, subset, arr, 0,score,hmap);
      
        return max;
    }
    
    public void calsub(String[]nums,List<String> subset , int[]arr , int index, int[] score, HashMap<String, Integer> hmap){
        
        int sum =0 ; 
         for(String str: subset){
         
             if(hmap.containsKey(str)){
                 sum=sum+hmap.get(str);
             }else{
                 int tempsum =0; 
                 for(int i=0;i<str.length();i++){
                   tempsum=tempsum+score[str.charAt(i)-'a'];
                 }
                 hmap.put(str, tempsum);
                 sum=sum+tempsum;
             }
            
             
    
        }
    
        max=Math.max(max, sum);
        
        for(int i=index; i<nums.length;i++){
            
            String s = nums[i];
            StringBuilder temp = new StringBuilder(); 
            for(int j=0; j<s.length();j++){
             char c = s.charAt(j);
                if(arr[c-'a']>0){
                    temp=temp.append(s.charAt(j));
                    arr[c-'a']--;
                }
            }
            
            if(temp.toString().equals(nums[i])){
               subset.add(nums[i]); 
               calsub(nums, subset, arr,i+1,score,hmap);
                subset.remove(subset.size()-1);
                
            }
            String te = temp.toString();
            for(int j=0;j<te.length();j++){
                char t = te.charAt(j);
                arr[t-'a']++;
            }
           
            
        }
        
        
    }
    
    
}
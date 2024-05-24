class Solution {
   int max =0; 
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
       
        
        int[]arr  =new int[26];
        Arrays.fill(arr,0);
      //  HashMap<Character, Integer> hmap = new HashMap<>();
        for(char c: letters){
            arr[c-'a']++;
        }
        
        List<String> subset = new ArrayList<>();
        int index =0;
         calsub(words, subset, arr, 0,score);
      
        return max;
    }
    
    public void calsub(String[]nums,List<String> subset , int[]arr , int index, int[] score){
        
        int sum =0 ; 
         for(String str: subset){
         
            for(int i=0;i<str.length();i++){
                sum=sum+score[str.charAt(i)-'a'];
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
               calsub(nums, subset, arr,i+1,score);
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
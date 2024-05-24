class Solution {
   int max =0; 
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
       
     //precalculate score of each word 
        
        HashMap<String, Integer> scoreMap = new HashMap<>();
        for(String word: words){
            
            int sum =0;
            for(int i=0;i<word.length();i++){
                sum=sum+score[word.charAt(i)-'a'];
            }
            scoreMap.put(word, sum);
            
        }
        
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(char c: letters){
            hmap.put(c, hmap.getOrDefault(c,0)+1);
        }
        
        List<String> subset = new ArrayList<>();
        int index =0;
         calsub(words, subset, hmap, 0,scoreMap);
    
      
        return max;
    }
    
    public void calsub(String[]nums,List<String> subset , HashMap<Character, Integer> hmap, int index, HashMap<String, Integer> scoreMap){
        
        //res.add(new ArrayList<>(subset));
        int sum =0 ; 
         for(String str: subset){
             sum=sum+scoreMap.get(str);
              /* for(int i=0;i<str.length();i++){
                   char c =str.charAt(i);
                  // System.out.println("c is "+c);
                   sum=sum+score[c-'a'];
               }*/
            }
        max=Math.max(max, sum);
        
        for(int i=index; i<nums.length;i++){
            
            String s = nums[i];
            String temp = ""; 
            for(int j=0; j<s.length();j++){
                if(hmap.containsKey(s.charAt(j)) && hmap.get(s.charAt(j))>0){
                    temp=temp+s.charAt(j);
                    hmap.put(s.charAt(j), hmap.get(s.charAt(j))-1);
                }
            }
            
            if(temp.equals(nums[i])){
               subset.add(nums[i]); 
               calsub(nums, subset, hmap,i+1,scoreMap);
                subset.remove(subset.size()-1);
                
            }
            
            for(int j=0;j<temp.length();j++){
                char t = temp.charAt(j);
                hmap.put(t, hmap.getOrDefault(t,0)+1);
            }
           
            
        }
        
        
    }
    
    
}
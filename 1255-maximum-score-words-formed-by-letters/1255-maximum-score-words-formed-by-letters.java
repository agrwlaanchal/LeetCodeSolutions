class Solution {
   int max =0; 
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
       
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(char c: letters){
            hmap.put(c, hmap.getOrDefault(c,0)+1);
        }
        
        List<List<String>>  res = new ArrayList<>();
        List<String> subset = new ArrayList<>();
        int index =0;
         calsub(words, subset,res, hmap, 0,score);
    
        //  return res;
   
        /*for(List<String> l : res){
         //   System.out.println(l.toString());
             int sum = 0; 
            for(String str: l){
               for(int i=0;i<str.length();i++){
                   char c =str.charAt(i);
                  // System.out.println("c is "+c);
                   sum=sum+score[c-'a'];
               }
            }
            max=Math.max(max,sum);
        }*/
        return max;
    }
    
    public void calsub(String[]nums,List<String> subset ,  List<List<String>>  res, HashMap<Character, Integer> hmap, int index,int[] score){
        
        //res.add(new ArrayList<>(subset));
        int sum =0 ; 
         for(String str: subset){
               for(int i=0;i<str.length();i++){
                   char c =str.charAt(i);
                  // System.out.println("c is "+c);
                   sum=sum+score[c-'a'];
               }
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
               calsub(nums, subset, res, hmap,i+1,score);
                subset.remove(subset.size()-1);
                
            }
            
            for(int j=0;j<temp.length();j++){
                char t = temp.charAt(j);
                hmap.put(t, hmap.getOrDefault(t,0)+1);
            }
           
            
        }
        
        
    }
    
    
}
class Solution {
    public List<String> commonChars(String[] words) {
      
        
        int [] arr1 = new int[26];
        int [] arr2 = new int[26];
        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);
        
        for(int i=0;i<words[0].length();i++){
            
            char c = words[0].charAt(i);
            arr1[c-97]++;
            
        }
        
        for(int i=1;i<words.length;i++){
            
            String word  = words[i];
            
            for(int j=0;j<word.length();j++){
             char c = word.charAt(j);
                
                arr2[c-97]++;
            }
            
            for(int j=0;j<26;j++){
                arr1[j] = Math.min(arr1[j],arr2[j]);
            }
            
            //reset arr2 
             Arrays.fill(arr2,0);
        }
        
       // System.out.println(Arrays.toString(arr1));
        List<String>  res = new ArrayList<>();
        for(int j=0;j<26;j++){
            
            if(arr1[j]>0){
                
                for(int i=0;i<arr1[j];i++){
                    res.add(""+(char)(97+j));
                }
            }
        }
        return res;
        
    }
}
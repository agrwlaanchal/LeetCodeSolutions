class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()){
            return false;
        }
        
        int[]arr1 = new int[26];
        int[]arr2 = new int[26];
        Arrays.fill(arr1, 0);
        Arrays.fill(arr2, 0);
        
        
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            arr1[c-'a']++;
        }
        
        for(int i=0;i<s1.length();i++){
            char c = s2.charAt(i);
            arr2[c-'a']++;
        }
        
        if(Arrays. equals(arr1, arr2)){
            return true;
        }
        
        int start=0;
        for(int end=s1.length(); end<s2.length();end++ ){
            
            arr2[s2.charAt(start)-'a']--;
            arr2[s2.charAt(end)-'a']++;
             
        if(Arrays. equals(arr1, arr2)){
            return true;
        }
            start++;
            
        }
        
        return false;
        
    }
}
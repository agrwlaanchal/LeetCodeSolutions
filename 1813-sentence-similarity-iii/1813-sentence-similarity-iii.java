class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String[]arr1 = sentence1.split(" ");
        String[]arr2 = sentence2.split(" ");
        
        int start =0;
        int end1 = arr1.length-1;
        int end2 = arr2.length-1;
        
        int s1len = arr1.length;
        int s2len = arr2.length; 
        
        if(s1len>s2len){
            return areSentencesSimilar(sentence2, sentence1);
        }
        
        while(start<s1len && arr1[start].equals(arr2[start])){
            start++;
        }
        
        while(end1>=0 && arr1[end1].equals(arr2[end2])){
            end1--;
            end2--;
        }
        
        return end1<start;
        
    }
}
class Solution {
    public long dividePlayers(int[] skill) {
     
        Arrays.sort(skill);
        
        long sum = skill[0]+skill[skill.length-1];
        long pro = skill[0]*skill[skill.length-1];
        
        int start =1;
        int end = skill.length-2;
        
        while(start<end){
            
            int tempSum = skill[start]+skill[end];
            if(tempSum!=sum){
                return -1;
            }
            pro=pro+skill[start]*skill[end];
            start++;
            end--;
        }
        return pro; 
        
    }
}
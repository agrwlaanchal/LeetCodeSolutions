class Solution {
    public int findContentChildren(int[] g, int[] s) {
     
        Arrays.sort(g);
        Arrays.sort(s);
        
        int sindex = 0;
        int count=0;
        for(int i=0; i<g.length; i++){
            
            while(sindex<s.length ){
                if(s[sindex]>=g[i]){
                    count++;
                    sindex++;
                    break;
                }
                sindex++;
                
            }
           
        }
        
        return count; 
        
    }
}
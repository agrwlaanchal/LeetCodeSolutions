class Solution {
    public String addSpaces(String s, int[] spaces) {
       
        Arrays.sort(spaces);
        int sindex = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        while(i<s.length() && sindex<spaces.length){
            
            if(i==spaces[sindex]){
                sb.append(" ");
                sb.append(s.charAt(i));
                sindex++;
            }else{
                sb.append(s.charAt(i));
            }
            i++;
            
            
        }
        
        while(i<s.length()){
            sb.append(s.charAt(i));
            i++;
        }
        
        return sb.toString();
        
    }
}
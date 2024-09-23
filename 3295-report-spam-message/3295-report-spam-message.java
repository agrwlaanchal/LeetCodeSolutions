class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
     
        int count =0;
        HashSet<String> hset = new HashSet<>();
        for(String str: bannedWords){
            hset.add(str);
        }
        
        for(int i=0;i<message.length; i++){
            if(hset.contains(message[i])){
                count++;
                if(count>=2)
                    return true;
            }
            
        }
        
        return false;
    }
}
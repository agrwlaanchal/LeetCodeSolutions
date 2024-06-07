class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
     
        Collections.sort(dictionary);
        
        
        HashMap<String, String> hmap = new HashMap<>();
        String res="";
        String[]sent = sentence.split(" ");
        for(int i=0; i<sent.length;i++){
            
            String word = sent[i];
            boolean flag=false;
            if(!hmap.containsKey(word)){
                 for(String w: dictionary){
                    
                     if(word.startsWith(w)){
                         hmap.put(word, w);
                         res=res+w+" ";
                         flag=true;
                         break;
                     }
                
                }
                if(!flag){
                    res=res+word+" ";
                }
                
            }else{
                    res=res+hmap.get(word)+" ";
            }
            
        }
        //System.out.print("res is "+res);
        return res.substring(0, res.length()-1);
        
        
    }
}
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
     
        HashMap<String, Integer> hmap = new HashMap<>();
        
        for(String s: cpdomains){
            //it's google.mail.com
            String[] newte = s.split(" ");
         //   hmap.put(newte[1], Integer.valueOf(newte[0]));
          
            String temp[] = newte[1].split("\\.");
            //System.out.println("temp is "+Arrays.toString(temp));
            //all string we form now 
            for(int i=0; i<temp.length;i++){
                
                String toadd = temp[i];
                 for(int j=i+1; j<temp.length;j++){
                     toadd=toadd+"."+temp[j];
                 }
                
                //System.out.println("toadd is "+toadd);
                
                if(hmap.containsKey(toadd)){
                    hmap.put(toadd, hmap.get(toadd)+Integer.valueOf(newte[0]));
                }else{
                    hmap.put(toadd, Integer.valueOf(newte[0]));
                }
                
                
            }
            
            
            
            
            
        }
        
        List<String> res = new ArrayList<>();
            for(Map.Entry<String,Integer> entry : hmap.entrySet()){
                res.add(entry.getValue()+" "+entry.getKey());
            }
            
            Collections.sort(res);
            return res; 
        
        
        
    }
}
class Solution {
    public String frequencySort(String s) {
     
        
        //let's try it this way  
        //create hashmap and maintain highest count 
        
        char []arr = s.toCharArray();
        
        int count=1;
        int max=0;
        HashMap<Integer, ArrayList<Character>> hmap  =new HashMap<>();
        
        HashMap<Character,Integer > nmap = new HashMap<>();
        for(int j=0;j<arr.length;j++){
            
            
            if(nmap.containsKey(arr[j])){
                nmap.put(arr[j], nmap.get(arr[j])+1);
            }else{
                 nmap.put(arr[j], 1);
            }
            
        }
        
        
        
        for(Map.Entry<Character, Integer>entry : nmap.entrySet()){
            
            
            if(hmap.containsKey(entry.getValue())){
                
                ArrayList<Character> temp = hmap.get(entry.getValue());
                temp.add(entry.getKey());
                hmap.put(entry.getValue(), temp);
                
            }else{
                  ArrayList<Character> temp = new ArrayList<>();
                  temp.add(entry.getKey());
                hmap.put(entry.getValue(), temp);
            }
            
            if(max<entry.getValue())
                max=entry.getValue();
            
        }
        
        
        
        int i;
        
        
       /* for( i=0;i<arr.length;i++){
            
            if(i+1<arr.length && arr[i+1]!=arr[i] ){
                
                if(hmap.containsKey(count)){
                    ArrayList<Character> alist = hmap.get(count);
                    alist.add(arr[i]);
                    hmap.put(count, alist);
                    if(count>max)
                        max=count; 
                    count=1;
                }else{
                       ArrayList<Character> alist =new ArrayList<>();
                    alist.add(arr[i]);
                    hmap.put(count, alist);
                    if(count>max)
                        max=count; 
                    count=1;
                }
                
            }else{
                count++;
            }
            
        }
        
       
      
               if(hmap.containsKey(count)){
                    ArrayList<Character> alist = hmap.get(count);
                    alist.add(arr[arr.length-1]);
                    hmap.put(count, alist);
                    if(count>max)
                        max=count; 
                }else{
                       ArrayList<Character> alist =new ArrayList<>();
                    alist.add(arr[arr.length-1]);
                    hmap.put(count, alist);
                    if(count>max)
                        max=count; 
                }
        
      */
        for(Map.Entry<Integer, ArrayList<Character>> entry: hmap.entrySet()){
            
            System.out.print(entry.getKey()+" ");
        ArrayList<Character> r = entry.getValue();
            for(int k=0 ; k<r.size();k++){
                System.out.print(r.get(k)+" ");
            }
            System.out.println();
            
        }
        
        String res="";
        for( i=max; i>=1;i--){
            
            if(hmap.containsKey(i)){
                
                ArrayList<Character> temp = hmap.get(i);
                
                for(int j=0;j <temp.size();j++){
                    
                    for(int k=0;k<i;k++){
                        res=res+temp.get(j);
                    }
                }
            }
            
        }
        
        return res; 
        
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<String, Character> hmap = new HashMap<>();
        HashMap<Character, String> hmap2 = new HashMap<>();     
      
        String[]arr = s.split(" ");
        
        if(pattern.length()!=arr.length){
            return false;
        }
       // System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            
            char c =pattern.charAt(i);
         //  System.out.println(arr[i]+" "+c);
            if(!hmap.containsKey(arr[i]) && !hmap2.containsKey(c)){
                hmap.put(arr[i],c);
                hmap2.put(c, arr[i]);
            }else{
       
         //       System.out.println(hmap.get(arr[i]));
          //      System.out.println(hmap2.get(c));
    
                
                if(hmap.containsKey(arr[i])){
                    //System.out.println(hmap.get(arr[i]));
                    if(hmap.get(arr[i])!=c){
                     //   System.out.println("going here ");
                        return false;
                    }
                }
                
                if(hmap2.containsKey(c)){
                 //  System.out.println(hmap2.get(c));
                    if(!hmap2.get(c).equals(arr[i])){
                   //    System.out.println("going here 2");
                        return false;
                    }
                }
                
            }
            
        }
        return true;
    }
}
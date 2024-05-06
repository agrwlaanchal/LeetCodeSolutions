class Solution {
    public int minAnagramLength(String s) {
     
        HashMap<Character, Integer> hmap =new HashMap<>();
        for(int i=0; i<s.length();i++){
            
            char c = s.charAt(i);
            
            
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)+1);
            }else{
                hmap.put(c, 1);
            }
            
        }
        
        int commonDivisor = hmap.get(s.charAt(0));
        
        for (int f : hmap.values()) {
            commonDivisor = gcd(commonDivisor, f);
        }

        return s.length() / commonDivisor;
        
    
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    
    
}
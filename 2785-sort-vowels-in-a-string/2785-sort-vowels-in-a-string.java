class Solution {
    public String sortVowels(String s) {
     
        PriorityQueue <Character> pr = new PriorityQueue<>();
        
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Integer> replace = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch == 'o' || ch== 'u'
              || ch=='A' || ch=='E' || ch =='I'||ch=='O'||ch=='U'){
                replace.add(i);
                pr.add(ch);
            }else{
                arr.add(ch);
            }
            
            
            
            
            
        }
        
        for(int i: replace){
            arr.add(i, pr.poll());
        }
        
        String res = "";
        for(char c: arr){
            res =res+c;
        }
        return res;
        
        
    }
}
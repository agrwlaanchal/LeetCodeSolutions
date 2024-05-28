class Solution {
    public String convert(String s, int numRows) {
      
        if(s.length()<numRows){
            return s;
        }
        ArrayList<StringBuilder> arr= new ArrayList<>();
        int i;
        for( i=0;i<numRows;i++){
            StringBuilder t = new StringBuilder();
                t.append(s.charAt(i));
            arr.add(t);
        }
        
        //now i have 4 strings 
        
        
        while(i<s.length()){
            
            
            for(int j=numRows-2;j>0;j--){
                if(i<s.length()){
                StringBuilder temp =arr.get(j);
                temp.append(s.charAt(i));
             //  System.out.println("adding "+temp);
                    arr.remove(j);
                    arr.add(j, temp);
                i++;
                }else{
                    break;
                }
            }
            
            for(int j=0;j<numRows;j++){
                if(i<s.length()){
                 StringBuilder temp =arr.get(j);
                temp.append(s.charAt(i));
                    arr.remove(j);
                arr.add(j, temp);
                i++;
                }
                else{
                    break;
                }
            }
            
        }
        
        StringBuilder res= new StringBuilder();
        for(StringBuilder str: arr){
            res.append(str);
        }
        
        return res.toString(); 
    }
}
class Solution {
    public String reverseWords(String s) {
        
        // the sky is blue 
        // eulb si yks eht
        // blue is sky the 

        String temp = "";
        s=s.trim();
        for(int i=s.length()-1; i>=0; i--){
            temp=temp+s.charAt(i);
        }

        int index  ;
        String t = "";
        String res ="";
        ArrayList<String> arr = new ArrayList<>();
        for(index=0; index<temp.length();index++){
            if(temp.charAt(index)==' '){
                //reverse t and add to res;
                //add ' '
                for(int i=t.length()-1;i>=0;i--){
                    res=res+t.charAt(i);
                }
                if(res.length()>0)
                arr.add(res);
                res="";
                t="";
            }else{
                t=t+temp.charAt(index);
            }

        }

        if(t.length()>0){
             for(int i=t.length()-1;i>=0;i--){
                    res=res+t.charAt(i);
                }
                 if(res.length()>0)
                arr.add(res);
        }

        String result ="";
        for(int i=0;i<arr.size();i++){
            result=result+arr.get(i)+" ";
        }
        return result.substring(0, result.length()-1);

    }
}
class Solution {
    public String simplifyPath(String path) {
     
        
        String[]arr = path.split("/");
        
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<arr.length;i++){
            
            String str = arr[i];
       //     System.out.println("working on "+str);
            if(str.length()<=0){
                continue; 
            }
            
            if(!str.equals(".")){
                if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else {
             st.push(str);   
            }
            }
            
            
           
            
        }
        
        String[]res= new String[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            String temp="/"+st.pop();
         //   System.out.println(temp);
            res[i]=temp;
        }
        
        StringBuilder result =new StringBuilder();
        for(int i=0;i<res.length;i++){
            result.append(res[i]);
        }
        if(result.length()<=0){
            return "/";
        }
        return result.toString();
        
        
        
    }
}
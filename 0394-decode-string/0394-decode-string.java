class Solution {
    public String decodeString(String s) {
     
        
        Stack<String> st = new Stack<>();
        
        String res="";
        for(int i=0 ; i<s.length();i++){
            
            char c= s.charAt(i);
            
            
            if(Character.isDigit(c)){
             
                int num = 0;
                while(s.charAt(i+1)!='['){
                    num=num*10+Integer.valueOf(""+s.charAt(i));
                    i++;
                    System.out.println("num is "+num);
                }
                num=num*10+Integer.valueOf(""+s.charAt(i));
                System.out.println("num is "+num);
                st.push(String.valueOf(num));
                
            } else if(c==']'){
            
                
                StringBuilder sb = new StringBuilder();
                
                while(!st.peek().equals("[")){
                    sb=sb.append(st.pop());
                }
                sb=sb.reverse();
                //System.out.println("after reverse "+sb);
                st.pop(); //remove [
                int repeat = Integer.valueOf(st.pop());
                System.out.println("repeat is "+repeat);
                String newtemp = "";
                for(int j=0;j<repeat;j++){
                  newtemp =newtemp+sb;
                }
                
               //System.out.println("pushing into stack "+newtemp);
                //st.push(newtemp);
                
                for(int j=0; j<newtemp.length();j++){
                    st.push(""+newtemp.charAt(j));
                }
             //   System.out.println("peeking "+st.peek());
                
            }else{
                st.push(""+c);
            }
            
            
            
        }
        
        StringBuilder str = new StringBuilder("");
        
        while(!st.isEmpty()){
            
           
           // sb = st.pop();
            str=str.append(st.pop());
        }
        
        
        
        //System.out.println(str);
        
        
        
        return str.reverse().toString();
        
        
    }
}
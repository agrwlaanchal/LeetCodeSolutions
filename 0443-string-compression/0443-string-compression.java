class Solution {
    public int compress(char[] chars) {
     
        
       
        if(chars.length==1)
            return 1;
       
        int count =1 ;   
        String s = ""+chars[0];
        char curr = chars[0];
        int index =1;
        
        for(int i=1;i<chars.length;i++){
            
            if(chars[i]==curr){
                count++;
            } else{
             //   System.out.println("count is"+count);
                if(count>1){
                    String temp =String.valueOf(count);
                    for(int j=0;j<temp.length();j++){
                        chars[index++]=temp.charAt(j);
                    }
                     s=s+count;
                }
               
            //     System.out.println("s is"+s);
                count=1;
                s=s+chars[i];
                chars[index++]=chars[i];
          //       System.out.println("s now is"+s);
                curr=chars[i];
         //        System.out.println("curr is"+curr);
            }
            
        }
        
        if(count>1){
                    String temp =String.valueOf(count);
                    for(int j=0;j<temp.length();j++){
                        chars[index++]=temp.charAt(j);
                    }
            s=s+count;
                }
        
         
       //    System.out.println("s final is"+s);
        return s.length();
        
    }
}
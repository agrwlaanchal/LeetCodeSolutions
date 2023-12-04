class Solution {
    public String largestGoodInteger(String nums) {


    

       int res = -1;
        
     for(int i=0; i<nums.length()-2;i++){

         if(nums.charAt(i)==nums.charAt(i+1) && nums.charAt(i)==nums.charAt(i+2)){
               int temp = Integer.valueOf(""+nums.charAt(i));
             
           //   System.out.println("temp is "+temp);
                 if(res<temp){
                     res = temp;
             
                 }
            
           //  System.out.println(res);
            
             
             
           i=i+2;    
         }
         

     }
        
        if(res==-1)
            return "";
        else
           return ""+res+res+res;

    }
}
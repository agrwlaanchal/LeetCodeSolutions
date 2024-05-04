class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
       //  int end = people.length-1;
          int count =0; 
        
        
     
        
       // boolean visited[] = new boolean[people.length];
        int start =0; 
        
      
        //2 2 8 8 11
        while(start<people.length ){
            
            
           // System.out.println("this is for start "+start);
            int oldstart  = start;
            
            if(people[start]<0){
                start++;
                continue;
            }
            
            //find the end  
            int end = people.length-1;
            
            while(start<end){
         //       System.out.println("start "+start+" end "+end);
                
            if(people[start]>0 && people[end]>0 &&  people[start]+people[end]<=limit){
       //         System.out.println("going here "+start+" "+end);
                count++;
                people[start]=-1;
                people[end]=-1;
                start++;
                break;
            }else{
                end--;
            }
            }
            
           // System.out.println("-------");
            
            if(oldstart ==start && people[start]<=limit){
              // System.out.println("only start increasing "+start);
                count++;
                start++;
            }
            
        //    System.out.println("********");
            
            
            
        }
        
        return count;
        
    }
}
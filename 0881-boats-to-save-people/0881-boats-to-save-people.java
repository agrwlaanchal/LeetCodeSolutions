class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
        
        boolean visited[] = new boolean[people.length];
        int start =0; 
        
        int count =0; 
        //2 2 8 8 11
        while(start<people.length ){
            
            
           // System.out.println("this is for start "+start);
            int oldstart  = start;
            
            if(visited[start]){
                start++;
                continue;
            }
            
            //find the end  
            int end = people.length-1;
            
            while(start<end){
         //       System.out.println("start "+start+" end "+end);
                
            if(!visited[start] && !visited[end] &&  people[start]+people[end]<=limit){
       //         System.out.println("going here "+start+" "+end);
                count++;
                visited[start]=true;
                visited[end]=true;
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
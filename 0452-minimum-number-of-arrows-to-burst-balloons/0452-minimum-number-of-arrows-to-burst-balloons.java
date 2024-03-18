class interval{
    int start;
    int end;
}
class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if(points.length==0)
            return 0;
        
        HashSet<int[]> hset = new HashSet<>();
        Arrays.sort(points, new Comparator<int[]>(){
            
        
            public int compare(final int []a1, final int []a2){
                
                if (a1[0] > a2[0]) 
                return 1; 
            else
                return -1; 
                
            }
            
        });
        
       
        
        //overlap interval
        int res=0;
         
            
        for(int i=1;i<points.length;i++){
            
            if(points[i][0] <= points[i-1][1]){
                //overlapping
                points[i][0]= points[i-1][0];
                points[i][1] = Math.min(points[i-1][1] , points[i][1]);
                points[i-1][1] =points[i][1];
                
               
                
            }
            
              
        }
        int count=1;
         for(int i=1;i<points.length;i++)
         {
             if(points[i][0]!=points[i-1][0] && points[i][1]!=points[i-1][1])
                 count++;
                 
                 
         }   
        
        return count;
        
        
           
        
    }
}
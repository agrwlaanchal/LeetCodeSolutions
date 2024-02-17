class interval{
    int start;
    int end;
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        if(intervals.length<=0)
        return 0; 


          Arrays.sort(intervals, new Comparator<int[]>(){
            
        
            public int compare(final int []a1, final int []a2){
                
                if (a1[0] > a2[0]) 
                return 1; 
                else if (a1[0]==a2[0]){
                    return a1[1]-a2[1];
                }
                return -1; 
                
            }
            
        });

        for(int i=0; i<intervals.length; i++){
            
                System.out.println(intervals[i][0]+","+intervals[i][1]);
            
        }

System.out.println("--------------------");
       

    int count =0;
      
      for(int i=1; i<intervals.length;i++){

          if( intervals[i][0]<intervals[i-1][1]){
              //there is overlap
              count=count+1;
              intervals[i][0]=intervals[i-1][0];
              intervals[i][1]=Math.min(intervals[i-1][1], intervals[i][1]);
          }

      }

      return count; 



    }
}
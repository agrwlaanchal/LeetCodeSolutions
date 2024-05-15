class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        
        
  
          Arrays.sort(intervals, new Comparator<int[]>(){
            
            
            @Override
            public int compare(int[]arr1, int[]arr2){
                
                if(arr1[1]==arr2[1]){
                    return arr1[0]-arr2[0];
                }
                return arr1[1]-arr2[1];
                
            }
            
        });
        
        
        // 02 13 24 35 46 
        // 02 02 24 35 46
        
        int count =0; 

        for(int i=1;i<intervals.length;i++){
        
            
            if( intervals[i][0]<intervals[i-1][1] ){
      
                
                
                intervals[i][1]=intervals[i-1][1];
                count++;
                
            }
            
            
        }
        return count; 
        
        
    }
}
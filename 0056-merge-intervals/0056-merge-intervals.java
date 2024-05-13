class Solution {
    public int[][] merge(int[][] intervals) {
     
      
     

        
        Arrays.sort(intervals, new Comparator<int[]>(){
            
            
            @Override
            public int compare(int[]arr1, int[]arr2){
                
                if(arr1[0]==arr2[0]){
                    return arr1[1]-arr2[1];
                }
                return arr1[0]-arr2[0];
                
            }
            
        });
        
      
        
       
        
       // int[][]res = new int[intervals.length][2];
        //res[0][0]=intervals[0][0];
        //res[0][1]=intervals[0][1];
        int index =0; 
        for(int i=1;i<intervals.length;i++){
            
            if(intervals[index][1]>=intervals[i][0]){
                intervals[index][0] = Math.min(intervals[index][0], intervals[i][1]);
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            }else{
                //res[index][0]=intervals[i][0];
                //res[index][1]=intervals[i][1];
                index++;
                intervals[index][0]=intervals[i][0];
                intervals[index][1]=intervals[i][1];
               
            }
            
            
        }
        
        
        
       int temp[][]=new int[index+1][2];
        for(int i=0;i<temp.length;i++){
            temp[i][0]=intervals[i][0];
            temp[i][1]=intervals[i][1];
        }
        return temp;
        
        //return result;
    }
}
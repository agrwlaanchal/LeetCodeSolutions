class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            
            @Override
            public int compare(final int[] entry1,
                               final int[] entry2)
            {

                // To sort in descending order revert
                // the '>' Operator
                if(entry2[1]==entry1[1]){
                    return entry1[0]-entry2[0];
                }
                return entry2[1]-entry1[1];
               
            }
        }); 
        
        int sum =0;
        
        for(int i=0;i<boxTypes.length;i++){
            
            if(truckSize>0){
                int num = boxTypes[i][0];
                if(truckSize>=num){
                    truckSize = truckSize-num;
                    sum=sum+(num*boxTypes[i][1]);
                }else{
                    sum=sum+(truckSize*boxTypes[i][1]);
                    truckSize=0;
                }
            }else{
                break;
            }
            
        }
        return sum; 
        
    }
}
class Solution {
    public int countDays(int days, int[][] meetings) {
        
     Arrays.sort(meetings, new Comparator<int[]>() {
            public int compare(int[] i1, int[] i2)
            {
                return i1[0] - i2[0];
            }
        });
 
        int index = 0; // Stores index of last element
        // in output array (modified arr[])
 
        // Traverse all input Intervals
        for (int i = 1; i < meetings.length; i++) {
            // If this is not first Interval and overlaps
            // with the previous one
            if (meetings[index][1] >= meetings[i][0]) {
                // Merge previous and current Intervals
                meetings[index][1]
                    = Math.max(meetings[index][1], meetings[i][1]);
            }
            else {
                index++;
                meetings[index] = meetings[i];
            }
        }
    
        
      int ind=1;
        
        int res=0;
        for(int i=0;i<=index;i++){
            
               int start =meetings[i][0];
            int end = meetings[i][1];
            
            if(ind<start){
               res=res+start-ind; 
            }
       //     System.out.println(index+" "+start+" "+end+" "+res);
            ind=end+1; 
            
        }
     //   System.out.println(ind+" "+days);
        if(ind<=days)
        res=res+days-ind+1;
      

        return res;
        
    }
}
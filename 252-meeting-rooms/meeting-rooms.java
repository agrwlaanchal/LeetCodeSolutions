class Solution {
    public boolean canAttendMeetings(int[][] intervals) {

     
     if(intervals.length<=1){
         return true;
     }
        Arrays.sort(intervals, (int[] o1, int[] o2) -> o1[0] - o2[0]);
      /*  for(int i=0;i<intervals.length;i++){
            System.out.print("["+intervals[i][0]+","+intervals[i][1]+"] ");
        }*/
        

        int res=1;

        for(int i=1; i<intervals.length;i++){
            if(intervals[i][0]>=intervals[i-1][1]){
                res++;
            }
        }

        return res==intervals.length;

    }
}
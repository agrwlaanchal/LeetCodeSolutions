class Pair{
    int start;
    int end; 
}
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     
        
        if(intervals.length<=0){
           int[][]res = new int[1][2];
            res[0][0] = newInterval[0];
            res[0][1]=newInterval[1];
            return res;
        }
        
        boolean flag = false;
        for(int i=0; i<intervals.length; i++){
            
            if(intervals[i][0]<=newInterval[0] && intervals[i][1]>=newInterval[0]){
                intervals[i][0] = Math.min(intervals[i][0], newInterval[0]);
                intervals[i][1] = Math.max(intervals[i][1], newInterval[1]);
                flag=true;
            }
            
        }
        
        if(!flag){
            
            int[][]res = new int[intervals.length+1][2];
           
            for(int i=0 ; i<intervals.length ;i++){
                res[i][0] = intervals[i][0];
                res[i][1]=intervals[i][1];
            }
            
            res[res.length-1][0]=newInterval[0];
            res[res.length-1][1]=newInterval[1];
                
            
            intervals=res;
           
        }
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                final int time1 = entry1[0];
                final int time2 = entry2[0];
                return time1-time2;
            }
        });
        
        
  /*   for(int i=0; i<intervals.length; i++){
            System.out.print("["+intervals[i][0]+","+intervals[i][1]+"] ");
        }*/
      
        
        
        
        ArrayList<Pair> arr = new ArrayList<>();
        Pair p =new Pair();
        p.start=intervals[0][0];
        p.end = intervals[0][1];
        arr.add(p);
        int index =0 ; 
        for(int i=1;i<intervals.length;i++){
            
            if(arr.get(index).end<intervals[i][0]){
                //not overlapping 
                 p = new Pair();
                p.start = intervals[i][0];
                p.end = intervals[i][1];
                arr.add(p);
                index++;
            }else{
                //overlapping
                 p = new Pair();
                p.start = Math.min(arr.get(index).start, intervals[i][0]);
                p.end = Math.max(arr.get(index).end, intervals[i][1]);
                arr.remove(index);
                arr.add(p);
            }
        }
        
       // System.out.println(arr.size());
        int[][] res = new int[arr.size()][2];
        
        
        for(int i=0 ; i<res.length;i++){
            res[i][0] = arr.get(i).start;
            res[i][1] = arr.get(i).end;
        }
        return res; 
        
    }
}
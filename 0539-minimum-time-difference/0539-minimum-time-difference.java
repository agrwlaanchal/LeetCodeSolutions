class Solution {
    public int findMinDifference(List<String> timePoints) {
       
        // convert input to minutes
        int[] minutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3));
            minutes[i] = h * 60 + m;
        }
        
        Arrays.sort(minutes);
        
        int ans = minutes[1]-minutes[0];
        
        for(int i=2;i<minutes.length;i++){
            ans  = Math.min(minutes[i]-minutes[i-1], ans);
        }
        
        ans = Math.min(ans, 24*60 - minutes[minutes.length-1]+minutes[0]);
        return ans; 
        
        
    }
}
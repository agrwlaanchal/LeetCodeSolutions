class Solution {
    public int maxDistance(int[] position, int m) {
        
        int answer = 0;
        int n = position.length;
        Arrays.sort(position);
         int low = 1;
        int high = (int) Math.ceil(position[n - 1] / (m - 1.0));
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(helper(mid, position, m)){
                answer = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return answer; 
    }
    
    
    private boolean helper(int gap, int[] position, int m){
        
        
        int prevBallpos = position[0];
        int ballsPlaced = 1;
        
        for(int i=1;i<position.length && ballsPlaced<m ;i++){
             
            int curr = position[i];
            if(Math.abs(curr-prevBallpos)>=gap){
                ballsPlaced++;
                prevBallpos=curr;
            }
            
        }
        
        return ballsPlaced==m;
        
    }
    
}
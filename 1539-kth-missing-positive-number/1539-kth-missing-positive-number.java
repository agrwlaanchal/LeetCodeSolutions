class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        boolean visited[]=new boolean[10000];
        visited[0]=true;
        
        for(int i=0;i<arr.length;i++){
            visited[arr[i]]=true;
        }
        
        int count=0;
        int index=1;
        while(count<k){
            
            if(!visited[index]){
                count++;
            }
            index++;
        }
        
        return index-1;
        }
}
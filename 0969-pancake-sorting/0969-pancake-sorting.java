class Solution {
    public List<Integer> pancakeSort(int[] arr) {
     
        List<Integer> res = new ArrayList<>();
        
        int[]temp = arr.clone();
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println(Arrays.toString(arr));
        int index =arr.length-1;
       while(!Arrays.equals(arr, temp)) {
           
           int ind  = findmax(arr, index);
           res.add(ind+1);
           reverse(arr, 0, ind); //including this index  
           res.add(index+1);
           reverse(arr, 0, index);
        
           index--; 
          // System.out.println(Arrays.toString(arr));
       }
        return res; 
        
        
    }
    
    public void reverse(int []arr, int start, int end){
        
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
    
    public int findmax(int[]arr, int index){
        
        int max = 0;
        for(int i=1;i<=index; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max; 
        
    }
    
}
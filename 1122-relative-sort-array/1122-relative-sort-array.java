class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
     
     
        int temp[] = new int[1001];
        Arrays.fill(temp, 0);
        
        for(int num:arr1){
            temp[num]++;
        }
        
        int[]res = new int[arr1.length];
        int index =0; 
        for(int i=0;i<arr2.length;i++){
            
            int num = arr2[i];
            int count = temp[num];
            for(int j=0;j<count;j++){
                res[index++]=num;
            }
          temp[num]=0;
        }
        
        for(int i=0;i<temp.length;i++){
            
            if(temp[i]>0){
                
                int count = temp[i];
                for(int j=0;j<count;j++){
                res[index++]=i;
                 }
                
            }
            
        }
        
        
        
        return res;
        
        
        
        
    }
}
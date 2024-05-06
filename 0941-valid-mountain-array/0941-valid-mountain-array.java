class Solution {
    public boolean validMountainArray(int[] arr) {
     
        
        if(arr.length<3){
            return false;
        }
        int index = 0;
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[index]==arr[i]){
                return false;
            }else if(arr[index]<arr[i]){
                index=i;
            }else{
                break;
            }
            
        }
        
        //System.out.println("index is "+index );
        
        if(index==0 || index==arr.length-1){
            return false;
        }
        
        int i;
        for(i=arr.length-1;i>index+1; i--){
           // System.out.println(arr[i-1]+ " "+arr[i]+" "+i);
            if(arr[i-1]==arr[i]){
                return false;
            }else if(arr[i-1]<arr[i]){
                return false;
            }
            
            
        }
        
    if(arr[i]>=arr[index]){
        return false;
    }
        
        return true; 
        
        
    }
}
class Solution {
    public int maximumLength(int[] nums) {
        
        
        ArrayList<Integer> arr1 = new ArrayList<>(); //all even
        ArrayList<Integer> arr2 = new ArrayList<>(); // all odd
        ArrayList<Integer> arr3 = new ArrayList<>(); // even odd
        ArrayList<Integer> arr4 = new ArrayList<>(); // odd even
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2==0){
                arr1.add(nums[i]);
             
                 if(arr3.size()==0){
                     arr3.add(nums[i]);
                 }else{
                     if(arr3.get(arr3.size()-1)%2==1){
                      arr3.add(nums[i]);
                    }
                     
                 }
                
                if(arr4.size()>=1 && arr4.get(arr4.size()-1)%2==1){
                     arr4.add(nums[i]);
                }
                
                
            }else{
                
                arr2.add(nums[i]);
                
                if(arr4.size()==0){
                    arr4.add(nums[i]);
                }else{
                    if(arr4.get(arr4.size()-1)%2==0){
                        arr4.add(nums[i]);
                    }
                }
                
                if(arr3.size()>=1 && arr3.get(arr3.size()-1)%2==0){
                    arr3.add(nums[i]);
                }
                
            }
            
            
        }
        
    /*    System.out.println(
            arr1.size()+" "+arr2.size()+" "+arr3.size()+" "+arr4.size());
        return -1;
      */
        return Math.max(arr1.size(), Math.max(arr2.size(), Math.max(arr3.size(),arr4.size())));
        
    }
}
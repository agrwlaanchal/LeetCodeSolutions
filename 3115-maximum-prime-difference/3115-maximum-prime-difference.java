class Solution {
    public int maximumPrimeDifference(int[] nums) {
        
       //find index of all prime numbers
        //sort 
        // get max
        // if only 1, return. 0; 
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            if(isPrime(nums[i])){
                arr.add(i);
            }
        }
        
       /* for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();*/
        if(arr.size()<=1){
            return 0;
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1)-arr.get(0);
        
    }
    
    public boolean isPrime(int n){
        
        if(n==1)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0||n%3==0){
            return false;
        }
        
        for(int i=5;i*i<=n; i=i+6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true; 
    }
    
}
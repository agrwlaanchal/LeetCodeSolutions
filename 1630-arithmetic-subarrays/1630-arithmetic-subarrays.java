class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            
            
            int start = l[i];
            int end = r[i];
           
            int []temp = new int[end-start+1];
            boolean flag=true;
            int index =0 ;
            for(int j=start;j<=end;j++){
                temp[index] = nums[j];
                index++;
            }
            Arrays.sort(temp);
       //     System.out.println(Arrays.toString(temp));
            int diff = temp[1]-temp[0];
            for(int j=2; j<temp.length;j++){
                if( (temp[j]-temp[j-1]) !=diff){
                    res.add(false);
                    flag=false;
                    break;
                } 
            }
            
            if(flag==true)
            res.add(true);
            
           
           
            
        }
        return res;
    }
}
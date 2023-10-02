class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start =0;
        int end = numbers.length-1;
        int res [] = new int[2];
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                res[0]=start+1;
                res[1]=end+1;
                return res;
            }else if(numbers[start]+numbers[end] < target){
                start++;
            }else{end--;}
        }
        
        return res;
    }
}
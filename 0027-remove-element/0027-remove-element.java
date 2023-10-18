class Solution {
    public int removeElement(int[] nums, int val) {
        

        int count=0;

        for(int i=0;i<nums.length ; i++){
            if(nums[i]!=val){
                swap(nums, i, count);
                count++;
            }
        }

        return count;


    }


    public void swap(int[]nums, int i, int k){
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k]=temp;
    }
}
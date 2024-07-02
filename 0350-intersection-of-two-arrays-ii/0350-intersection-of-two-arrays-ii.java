class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     
        int[]arr = new int[1001];
        Arrays.fill(arr,0);
        for(int num: nums1){
            arr[num]++;
        }
        ArrayList<Integer> result  =new ArrayList<>();
        for(int num: nums2){
            if(arr[num]>0){
                result.add(num);
                arr[num]--;
            }
        }
        
        int[] intArray = result.stream().mapToInt(i -> i).toArray();
        return intArray;
        
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
 
        HashSet<Integer> hset = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
            hset.add(nums1[i]);
        
        for(int i=0;i<nums2.length;i++)
        {
            if(hset.contains(nums2[i])){
                arr.add(nums2[i]);
               hset.remove(nums2[i]);
            }
        }
        
        
        int res[] =new int[arr.size()];
        
        int i=0;
        for(Integer num: arr){
            res[i] = num;
            i++;
        }
        
        return res;
        
    }
}
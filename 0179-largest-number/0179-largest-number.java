class Solution {
    public String largestNumber(int[] nums) {
     
        String[]arr =new String[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=""+nums[i];
        }
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        
    //    System.out.println(Arrays.toString(arr));
        String res = "";
        if(arr[0].equals("0")) return "0";
        for(int i=0;i<arr.length;i++){
            res=res+arr[i];
        }
        return res;
        
    }
}
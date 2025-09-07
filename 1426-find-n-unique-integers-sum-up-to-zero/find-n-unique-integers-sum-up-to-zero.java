class Solution {
    public int[] sumZero(int n) {
        
            
        ArrayList<Integer> arr = new ArrayList<>();
        if(n%2!=0){
            arr.add(0);
            n=n-1;
        }
        int num=1;
        for(int i=0;i<n/2;i++){
                arr.add(num);
                arr.add(-1*num);
                num++;
        }

        int[]res = new int[arr.size()];
            for(int i=0;i<arr.size();i++){
                res[i]=arr.get(i);
            }
            return res;



    }
}
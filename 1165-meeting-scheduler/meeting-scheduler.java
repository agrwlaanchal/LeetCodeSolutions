class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        List<Integer> res= new ArrayList<>();

        int n = slots1.length;
        int m = slots2.length;
        int startans = Integer.MAX_VALUE;
        if(n<=m){

          for(int i=0;i<slots1.length;i++){

            int start1 = slots1[i][0];
            int end1 = slots1[i][1];
           
            for(int j=0;j<slots2.length;j++){
                int start = Math.max(start1,slots2[j][0] );
                int end = Math.min(end1, slots2[j][1]);
              //   System.out.println(start+" "+end+" "+(end-start)+" "+duration);

                if(end-start>=duration){
                    int re = start;
                    if(re<=startans){
                        startans =re; 
                    }
                }
            }

          }

        }else{
 for(int i=0;i<slots2.length;i++){

            int start1 = slots2[i][0];
            int end1 = slots2[i][1];

            for(int j=0;j<slots1.length;j++){
                int start = Math.max(start1,slots1[j][0] );
                int end = Math.min(end1, slots1[j][1]);
                if(end-start>=duration){
                  int re = start;
                    if(re<=startans){
                        startans =re; 
                    }
                }
            }

          }
        }

       

if(startans==Integer.MAX_VALUE){
    return res; 
}
       res.add(startans);
       res.add(startans+duration);
       return res;  

    }
}
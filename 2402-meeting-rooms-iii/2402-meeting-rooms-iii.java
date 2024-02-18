import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        // Sort meetings by start time
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        
        int[]arr = new int[n];
        long[] endtime = new long[n];
        Arrays.fill(arr, 0);
          int room =-1;
     outer:   for(int i=0 ;i<meetings.length;i++){
            
       long mintime = endtime[0];
      room =0;
            
            for(int j=0;j<n;j++){
               if(arr[j]!=0){
                
                if(endtime[j]<=meetings[i][0]){
                     arr[j]=arr[j]+1;
                     endtime[j]=meetings[i][1];
               //       System.out.println(Arrays.toString(arr));
                //      System.out.println(Arrays.toString(endtime));
                    continue outer;
                }else{
                    if(mintime>endtime[j]){
                        mintime=endtime[j];
                        room=j;
                    }
                }
                
            }else if(arr[j]==0){
                arr[j]=1;
                endtime[j]=meetings[i][1];
             //        System.out.println(Arrays.toString(arr));
              //       System.out.println(Arrays.toString(endtime));
                continue outer;
            } 
            }
            
            
            arr[room]=arr[room]+1;
            endtime[room] = endtime[room]+(meetings[i][1]-meetings[i][0]);
            
      //     System.out.println(Arrays.toString(arr));
       //    System.out.println(Arrays.toString(endtime));
            
        }
        
        int max =0 ;
        int in =0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max = arr[i];
                in=i;
            }
        }
        return in; 
        
        
         }
}

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
     
        
        //get higheset index of each grabage 
        
        int indexM=-1;
        int indexP=-1;
        int indexG=-1;
        
        for(int i=0;i<garbage.length;i++){
            
            String temp = garbage[i];
            
            if(temp.indexOf('G')!=-1){
                indexG=i;
            }
            if(temp.indexOf('P')!=-1){
                indexP=i;
            }
            if(temp.indexOf('M')!=-1){
                indexM=i;
            }
            
        }
        
        
        int time=0;
        
        //for indexM 
        
      //  System.out.println(indexM);
       // System.out.println(indexP);
        //System.out.println(indexG);
        
        
        if(indexM>=0){
            for(int i=0;i<=indexM;i++){
                String temp = garbage[i];
                 if(i!=0){
                      time=time+travel[i-1];
                 }     
                
                
               for(int j=0;j<temp.length();j++){
                        if(temp.charAt(j)=='M')
                        {
                            time=time+1;
                        }
                    }
           //     System.out.println(i+" "+time);
                
            }
        }
        
      //  System.out.println(time);
         
        if(indexP>=0){
            for(int i=0;i<=indexP;i++){
                String temp = garbage[i];
                 if(i!=0){
                      time=time+travel[i-1];
                 }     
                
                
                for(int j=0;j<temp.length();j++){
                        if(temp.charAt(j)=='P')
                        {
                            time=time+1;
                        }
                    }
           //     System.out.println(i+" "+time);
                
            }
        }
        
        if(indexG>=0){
            for(int i=0;i<=indexG;i++){
                String temp = garbage[i];
                 if(i!=0){
                      time=time+travel[i-1];
                 }     
                
                
                
                
                if(temp.indexOf('G')!=-1){
                
                    for(int j=0;j<temp.length();j++){
                        if(temp.charAt(j)=='G')
                        {
                            time=time+1;
                        }
                    }
                  //   time=time+1;
                }
           //     System.out.println(i+" "+time);
                
            }
        }
        
        return time;
    }
}
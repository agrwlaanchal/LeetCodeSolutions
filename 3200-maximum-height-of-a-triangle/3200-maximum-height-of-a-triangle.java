class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        
        int res =0;
        
        //with red ball
        int level =0;
        int tred= red;
        int tblue= blue;
        while(true){
            
            level++;
            if(red>=level){
            red=red-level;
            }else{
                break;
            }
            level++;
            if(blue>=level){
            blue=blue-level;
            }else{
                break;
            }
            
        }
        
        
        res=level-1;
        level=0;
        red=tred;
        blue=tblue;
        while(true){
          //  System.out.println("going here "+blue+" red "+red);
            level++;
            if(blue>=level){
            blue=blue-level;
            }else{
                break;
            }
            level++;
            if(red>=level){
            //    System.out.println("after this, level "+level+" "+red);
            red=red-level; 
            }else{
                break;
            }
        //    System.out.println("after conditions");
            
        }
        return Math.max(res, level-1);
        
    }
}
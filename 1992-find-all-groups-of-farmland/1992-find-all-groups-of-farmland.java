class Solution {
    public int[][] findFarmland(int[][] land) {
      
         ArrayList<int[]> arr = new ArrayList<>();
        
        for(int i=0;i<land.length;i++){
            for(int j=0; j<land[i].length;j++){
                
                if(land[i][j]==1){
                    
               //     System.out.println("calling dfs for "+i+" "+j );
                    ArrayList<int[]> res = new ArrayList<>();
                    dfstraversal(i, j, land, res);
                       int temp[][]=new int[res.size()][2];
                    
                    for(int k=0;k<res.size();k++){
                        temp[k]=res.get(k);
                    }
                    
                Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });
                    
                    
                    
                int[]t = new int[4];
                t[0] = temp[0][0];
                t[1]=temp[0][1];
                t[2]=temp[temp.length-1][0];
                t[3]=temp[temp.length-1][1];
                    
               //     System.out.println("adding "+Arrays.toString(t));
                arr.add(t);
                }
                
             
                
                
            }
            
           
            
        }
         int[][]result = new int[arr.size()][];
            for(int i=0;i<arr.size();i++){
            
                result[i]=arr.get(i);
            }
            return result;
            
        
    }
    
    public void dfstraversal(int i, int j, int[][]land,ArrayList<int[]>res){
        
        int[]tenp = new int[2];
        tenp[0] = i;
        tenp[1]=j;
        res.add(tenp);
        
        land[i][j]=0;
        
        if(i+1<land.length && land[i+1][j]==1){
            dfstraversal(i+1,j,land, res);
        }
        
        if(j+1<land[i].length && land[i][j+1]==1){
            dfstraversal(i, j+1,land,res);
        }
        
        if(i-1>=0 && land[i-1][j]==1){
            dfstraversal(i-1, j,land,res);
        }
        if(j-1>=0 && land[i][j-1]==1){
            dfstraversal(i, j-1, land,res);
        }
        
        
    }
    
    
}
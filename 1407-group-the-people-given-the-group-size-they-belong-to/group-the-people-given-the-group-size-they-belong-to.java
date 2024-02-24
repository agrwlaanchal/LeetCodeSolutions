class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

       ArrayList<int[]> arr = new ArrayList<>();
       
       
     outer:  for(int i=0;i<groupSizes.length;i++){

           int gsize = groupSizes[i];
           for(int j=0;j<arr.size(); j++){
               if(arr.get(j).length==gsize){
                   //check if any unit is empty 
                   //if able to add , continue with outer: 
                    int[]t = arr.get(j);
                    for(int k=0; k<t.length;k++){
                        if(t[k]==-1){
                            t[k]=i;
                            continue outer;
                        }
                    }
               }
           }
           int[] temp = new int[gsize];
           Arrays.fill(temp,-1);
           temp[0]=i;
           arr.add(temp);

       }

       List<List<Integer> > res = new ArrayList<>();
       for(int i=0;i<arr.size(); i++){

           List<Integer> temp = new ArrayList<>();
           for(int num :  arr.get(i)){
               temp.add(num);
           }
           res.add(temp);

       }
       return res; 

    }
}
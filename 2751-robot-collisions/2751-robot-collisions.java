class Pair {
    
    int pos;
    int hel;
    char dir; 
    
    Pair(int p, int h, char d){
        pos=p;
        hel = h;
        dir = d; 
    }
    
}
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
     
      int n = positions.length;
        Pair[] robots = new Pair[n];

        for (int i = 0; i < n; i++) {
            robots[i] = new Pair(positions[i], healths[i], directions.charAt(i));
        }

        // sort the array based on position
        Arrays.sort(robots, Comparator.comparingInt(r -> r.pos));
   
        
         List<Integer>  res = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        
        
        // robots collide if current is  left and previous is right
        
        for(int i=0; i<robots.length;i++){
            
            int p = robots[i].pos;
            char d = robots[i].dir;
            int hel = robots[i].hel;    
            
            if(st.isEmpty()){
                Pair pair = new Pair(p,hel,d);
                st.push(pair);
            }else{
                           
                if(d=='L'){
                  // compare with previous and if it's right    
                   while (!st.isEmpty() && st.peek().dir == 'R') {
                        Pair p1 = st.pop();
                        if (p1.hel == hel) {
                            hel = -1;  // Both robots are destroyed
                            break;
                        } else if (p1.hel > hel) {
                            p1.hel--;
                            st.push(p1);
                            hel = -1;  // Current robot is destroyed
                            break;
                        } else {
                            hel--;
                        }
                    }
                    if (hel > 0) {
                        st.push(new Pair(p, hel, d));
                    } 
                }else{
                    st.push(new Pair(p, hel, d));
                }
                
            }
            
        }
        
       //make map of result list robots position and health   
        // since output is to be returned in same order as input 
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        while(!st.isEmpty()){
            Pair p = st.pop();
            hmap.put(p.pos, p.hel);
        }
        
        // add to the result
        for(int pos: positions){
            if(hmap.containsKey(pos)){
                res.add(hmap.get(pos));
            }
        }
        
        return res;
        
    }
}
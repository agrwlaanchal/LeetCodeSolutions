class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Character> q = new LinkedList<>();
        int countR = 0;
        int countD = 0;
        int dFloatingBan = 0, rFloatingBan = 0;

        for (int i = 0; i < senate.length(); i++) {
            char c = senate.charAt(i);
            if (c == 'R')
                countR++;
            else
                countD++;
            q.add(c);
        }

        if (countD == 0) {
            return "Radiant";
        }

        if (countR == 0) {
            return "Dire";
        }

        while (countR>0 && countD>0 ) {

            char c = q.poll();

            if (c == 'R') {

               if(rFloatingBan>0){
                   rFloatingBan--;
                   countR--;
               }else{
                   dFloatingBan++;
                   q.add('R');
               }

            } else {

                if(dFloatingBan>0){
                    dFloatingBan--;
                    countD--;
                }else{
                    rFloatingBan++;
                    q.add('D');
                }

            }

         
        }

     if(countR>0)
     return "Radiant";
     else
     return "Dire"; 
         
    }
}
class Solution {
    public int findComplement(int num) {
        String bina = Integer.toBinaryString(num);
        StringBuilder temp= new StringBuilder();
        for(int i=0;i<bina.length();i++){
            char c = bina.charAt(i);
            if(c=='1')
                c='0';
          else
              c='1';
        temp.append(c);
      }
       // System.out.println(bina+" "+temp);
        int decimal=Integer.parseInt(temp.toString(),2);  
        return decimal;
    }
}
class Solution {
    public int getLucky(String s, int k) {
     
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)-96);
        }
        
            int num =0;
     // String temp = sb.toString();
        for(int i=0;i<sb.length();i++){
            num=num+( sb.charAt(i)-'0');
        }
      //  System.out.println("num is "+num);
        for(int i=1;i<k;i++){
            int res =0;
            while(num>0){
                res=res+num%10;
                num=num/10;
            }
            num=res;
        }
        return num;
    }
}
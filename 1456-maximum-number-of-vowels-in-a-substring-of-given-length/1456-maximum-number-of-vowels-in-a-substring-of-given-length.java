class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int res =0 ;
        String temp = "";
    //    System.out.println(s.length());
        for (int i = 0; i < k; i++) {

            char c = s.charAt(i);
            if (isVowel(c)) {
                count++;
            }
            temp = temp + c;

        }
        res= Math.max(res, count);
      //  System.out.println(temp + " " + count);
        for (int i = k; i < s.length(); i++) {

            char toremove = temp.charAt(0);
            if (isVowel(toremove)) {
                count--;
            }

            char c = s.charAt(i);
            if (isVowel(c)) {
                count++;
            }

            temp = temp.substring(1);
            temp = temp + c;
       //     System.out.println(temp + " " + count);
            res= Math.max(res, count);

        }

        return res;

    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
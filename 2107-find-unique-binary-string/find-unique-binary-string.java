class Solution {
    public String findDifferentBinaryString(String[] nums) {

      int len = nums[0].length();

       Queue<String> pq = new LinkedList();
        pq.add("0");
        pq.add("1");
        while(pq.peek().length()!=len){
          
            String temp = pq.poll();
          //System.out.println(temp);
            String s = temp+"0";
            String t= temp+"1";
            pq.add(s);
            pq.add(t);
        }

        List<String> list = List.of(nums);
        while(!pq.isEmpty()){
            String s = pq.poll();
            if(!list.contains(s)){
                return s;
            }
        }
        return "";

    }
}
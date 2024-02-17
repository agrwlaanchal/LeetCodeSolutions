class Solution {
    public int equalPairs(int[][] grid) {

        HashMap<String, Integer> hmap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {

            String temp = Arrays.toString(grid[i]);
       //     System.out.println(temp);
            if (hmap.containsKey(temp)) {
                hmap.put(temp, hmap.get(temp) + 1);
            } else {
                hmap.put(temp, 1);
            }

        }
        int count = 0;
        for (int c = 0; c < grid.length; c++) {

            int[] arr = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                arr[i] = grid[i][c];
            }

            String temp = Arrays.toString(arr);
            if (hmap.containsKey(temp)) {
                count = count + hmap.get(temp);
            }

        }

        return count; 


    }
}
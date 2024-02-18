class Solution {
    public int minTotalDistance(int[][] grid) {

        // get the median of x points
        // get the median of y point
        // calculate distance from point p (x, y) to all other members and return the
        // sum

        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        ArrayList<Integer> xpoints = new ArrayList<>();
        ArrayList<Integer> ypoints = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ypoints.add(i);
                    xpoints.add(j);
                }
            }
        }

        // sort it
        Collections.sort(xpoints);
        Collections.sort(ypoints);

        // find the median
        int size = ypoints.size() / 2;
        int x = ypoints.get(size);
        int y = xpoints.get(size);

        // calculate distance from each point
        int distance = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1)
                    distance += Math.abs(x - i) +
                            Math.abs(y - j);

        return distance;

    }
}
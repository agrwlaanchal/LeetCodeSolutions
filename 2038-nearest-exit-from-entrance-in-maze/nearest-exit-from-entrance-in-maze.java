class point {
    int i;
    int j;

    point() {
        this.i = 0;
        this.j = 0;
    }

    point(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {

       Queue<int[]> pq = new LinkedList<>();
        int[] arr = new int[3];
        arr[0] = entrance[0];
        arr[1] = entrance[1];
        arr[2] = 0;
        pq.offer(arr);
        maze[entrance[0]][entrance[1]] = '+';

        if (pq.isEmpty()) {
            return -1;
        }

        for (int k = 0; k < maze.length; k++) {
            for (int t = 0; t < maze[0].length; t++) {
                System.out.print(maze[k][t] + " ");
            }
            System.out.println();
        }

        // int res = Integer.MAX_VALUE;

        int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!pq.isEmpty()) {

            int[] p = pq.poll();
            int curri = p[0];
            int currj = p[1];

            for (int[] dir : dirs) {

                int nextrow = curri + dir[0];
                int nextcol = currj + dir[1];

                if (issafe(nextrow, nextcol, maze)) {

                    if (atboundry(nextrow, nextcol, maze)) {
                        return p[2] + 1;
                    }

                    maze[nextrow][nextcol] = '+';
                    pq.offer(new int[] { nextrow, nextcol, p[2] + 1 });

                }

            }
        }

        return -1;

    }

    public boolean issafe(int i, int j, char[][] maze) {

        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length && maze[i][j] == '.';

    }

    public boolean atboundry(int i, int j, char[][] maze) {
        // System.out.println(p[0]+ " "+p[1]+" "+(maze.length-1)+"
        // "+(maze[0].length-1));
        if (i == 0 || i == maze.length - 1 || j == 0 || j == maze[0].length - 1) {
            return true;
        }
        return false;

    }

}
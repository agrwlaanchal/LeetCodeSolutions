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
        int dis = 1;
        int i = entrance[0];
        int j = entrance[1];
        maze[i][j] = '+';
        if (issafe(i + 1, j, maze)) {
            int[] temp = new int[3];
            temp[0] = i + 1;
            temp[1] = j;
            temp[2] = 1;
            pq.add(temp);
            maze[i + 1][j] = '+';
        }

        if (issafe(i - 1, j, maze)) {
            int[] temp = new int[3];
            temp[0] = i - 1;
            temp[1] = j;
            temp[2] = 1;
            pq.add(temp);
            maze[i - 1][j] = '+';
        }

        if (issafe(i, j + 1, maze)) {
            int[] temp = new int[3];
            temp[0] = i;
            temp[1] = j + 1;
            temp[2] = 1;
            pq.add(temp);
            maze[i][j + 1] = '+';
        }
        if (issafe(i, j - 1, maze)) {
            int[] temp = new int[3];
            temp[0] = i;
            temp[1] = j - 1;
            temp[2] = 1;
            pq.add(temp);
            maze[i][j - 1] = '+';

        }

        if (pq.isEmpty()) {
            return -1;
        }

        /*
         * for(int k=0;k<maze.length;k++){
         * for(int t=0;t<maze[0].length;t++){
         * System.out.print(maze[k][t]+" ");
         * }
         * System.out.println();
         * }
         */
        int res = Integer.MAX_VALUE;
        while (!pq.isEmpty()) {
            int size = pq.size();
            for (int k = 0; k < size; k++) {
                int[] p = pq.poll();

                if (atboundry(p, maze)) {
                   return p[2];
                } else {
                    if (issafe(p[0] + 1, p[1], maze)) {
                        int[] temp = new int[3];
                        temp[0] = p[0] + 1;
                        temp[1] = p[1];
                        temp[2] = p[2] + 1;
                        pq.add(temp);
                        maze[p[0] + 1][p[1]] = '+';

                    }
                    if (issafe(p[0] - 1, p[1], maze)) {
                        int[] temp = new int[3];
                        temp[0] = p[0] - 1;
                        temp[1] = p[1];
                        temp[2] = p[2] + 1;
                        pq.add(temp);
                        maze[p[0] - 1][p[1]] = '+';

                    }

                    if (issafe(p[0], p[1] + 1, maze)) {
                        int[] temp = new int[3];
                        temp[0] = p[0];
                        temp[1] = p[1] + 1;
                        temp[2] = p[2] + 1;
                        pq.add(temp);
                        maze[p[0]][p[1] + 1] = '+';

                    }
                    if (issafe(p[0], p[1] - 1, maze)) {
                        int[] temp = new int[3];
                        temp[0] = p[0];
                        temp[1] = p[1] - 1;
                        temp[2] = p[2] + 1;
                        pq.add(temp);
                        maze[p[0]][p[1] - 1] = '+';

                    }
                }

            }

        }

        if(res==Integer.MAX_VALUE)
        return -1;
        return res;

    }

    public boolean issafe(int i, int j, char[][] maze) {

        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length && maze[i][j] == '.';

    }

    public boolean atboundry(int[] p, char[][] maze) {
        // System.out.println(p[0]+ " "+p[1]+" "+(maze.length-1)+"
        // "+(maze[0].length-1));
        if (p[0] == 0 || p[0] == maze.length - 1 || p[1] == 0 || p[1] == maze[0].length - 1) {
            return true;
        }
        return false;

    }

}
class Solution {
    int[]parent; 
    int[] rank; 
    public int earliestAcq(int[][] logs, int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) { 
            parent[i] = i; 
             rank[i] = 0;
        } 

        Arrays.sort(logs, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                final int time1 = entry1[0];
                final int time2 = entry2[0];
                return time1 -time2;
            }
        });

        //System.out.println(Arrays.toString(logs));
        //return -1;
      
        int groupCount = n;
        UnionFind uf = new UnionFind(n);

        for(int[]arr:logs){

            int sc = arr[1];
            int ds = arr[2];

            uf.union(sc,ds);
               
            if(uf.components()==1){
                return arr[0];
            }

        }
        return -1;

    }


    private class UnionFind {
        
        private int[] parent;
        private int[] size;
        private int components;

        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            components = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int p) {
            if (parent[p] != p) {
                parent[p] = find(parent[p]); // Path compression
            }
            return parent[p];
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            
            if (rootP != rootQ) {
                if (size[rootP] < size[rootQ]) {
                    parent[rootP] = rootQ;
                    size[rootQ] += size[rootP];
                } else {
                    parent[rootQ] = rootP;
                    size[rootP] += size[rootQ];
                }
                components--;
            }
        }

        public int components() {
            return components;
        }




    }



}
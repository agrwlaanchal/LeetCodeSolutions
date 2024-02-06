class RecentCounter {
    ArrayList<Integer> arr;

    public RecentCounter() {
        arr = new ArrayList<>();
    }

    public int ping(int t) {

        arr.add(t);
        int start = t - 3000;
        int end = t;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {

            int num = arr.get(i);
            if (num >= start && num <= end) {
                count++;
            }

        }
        return count;

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
import java.util.*;

class Pair {
    int capital;
    int profit;

    Pair(int capital, int profit) {
        this.capital = capital;
        this.profit = profit;
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // Priority queue to manage projects by capital (in increasing order)
        PriorityQueue<Pair> capitalPQ = new PriorityQueue<>((a, b) -> Integer.compare(a.capital, b.capital));

        // Priority queue to manage projects by profit (in decreasing order)
        PriorityQueue<Pair> profitPQ = new PriorityQueue<>((a, b) -> Integer.compare(b.profit, a.profit));

        // Add all projects to the capital priority queue
        for (int i = 0; i < profits.length; i++) {
            capitalPQ.add(new Pair(capital[i], profits[i]));
        }

        int res = w;

        while (k > 0) {
            // Transfer all projects that can be afforded to the profit priority queue
            while (!capitalPQ.isEmpty() && capitalPQ.peek().capital <= w) {
                profitPQ.add(capitalPQ.poll());
            }

            // If no project can be afforded, break the loop
            if (profitPQ.isEmpty()) {
                break;
            }

            // Select the project with the highest profit
            w += profitPQ.poll().profit;
            res = w;
            k--;
        }

        return res;
    }
}

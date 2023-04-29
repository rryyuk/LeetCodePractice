class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> circle = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            circle.add(i);
        }
        while(circle.size() != 1) {
        for(int i = k-1;i>0;i--) {
            circle.add(circle.poll());
        }
        circle.poll();
        
        }

        return circle.poll();

    }
}

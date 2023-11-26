class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        PriorityQueue<Integer> isnstraighthand = new PriorityQueue<>();
        for (int i : hand) isnstraighthand.add(i);
        while (!isnstraighthand.isEmpty()) {
            int poll = isnstraighthand.poll();
            for (int j = 1; j<groupSize; j++) {
                if (!isnstraighthand.remove(poll + j)) return false;
            }
        }
        return true;
    }
}
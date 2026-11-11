class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        PriorityQueue<Integer> se = new PriorityQueue<>();
        PriorityQueue<Integer> st = new PriorityQueue<>();
        int total=0;

        for(int i=0;i<seats.length;i++){
            se.add(seats[i]);
            st.add(students[i]);
        }

        while(se.size()>0){
            total += Math.abs(se.poll() - st.poll());
        }

        return total;
    }
}
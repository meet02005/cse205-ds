class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> priorityqueue1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> priorityqueue2 = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Boolean> arraylist = new ArrayList<>();
        int nums = num;
            while(nums > 0){
             int numbers = nums % 10;
             if(numbers%2==0){
                priorityqueue1.add(numbers);
                arraylist.add(true);
            } else{
                priorityqueue2.add(numbers);
                arraylist.add(false);
            }
            nums /= 10;
    }
        long result = 0;
        for(int x = arraylist.size()-1;x>=0;x--){
            if(arraylist.get(x)){
                result += priorityqueue1.poll();
            }else{
                result += priorityqueue2.poll();
            }
              result = result * 10;
        }
            return (int) (result/10);
    }
}
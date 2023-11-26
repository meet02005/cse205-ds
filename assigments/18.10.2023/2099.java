class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] numA = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            numA[i]=nums[i];
        Arrays.sort(nums);
        ArrayList<Integer> arraylist = new ArrayList<>();
        int[] A = new int[k];
        int cnt = 0;
        for(int i=nums.length-1;i>=0;i--){
            cnt++;
            arraylist.add(nums[i]);
            if(cnt == k)
                break;
        }
        int idx = 0;
        for(int i=0;i<numA.length;i++){
            if(arraylist.contains(numA[i])){
                A[idx]=numA[i];
                idx++;
                arraylist.remove(arraylist.indexOf(numA[i]));
            }
        }
        return A;
    }
}
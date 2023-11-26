class Solution {
    List<List<Integer>> a1 = new ArrayList<>();
    List<Integer> s1 = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        toMakeSubsets(nums, nums.length, 0);
        return a1;
    }
     void toMakeSubsets(int[] nums, int n, int element) {
         if (element == n) {
         a1.add(new ArrayList<>(s1));
         return;
         }
         toMakeSubsets(nums,n,element+1);
         s1.add(nums[element]);
         toMakeSubsets(nums,n,element+1);
         s1.remove(s1.size()-1);
     }

}
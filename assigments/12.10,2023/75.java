class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
               int T = nums[mid];
               nums[mid] = nums[low];
               nums[low] = T;
               low++;
               mid++; 
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int T = nums[mid];
                nums[mid] = nums[high];
                nums[high] = T;
                high--;
            }
        }
    }
}
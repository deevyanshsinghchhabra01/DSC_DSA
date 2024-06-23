//1470. Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0; // Initialize index for ans array

        // Shuffle elements from nums into ans
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i]; // Copy nums[i] to ans // basically we just take in account in difeerence in n..
            ans[index++] = nums[i + n]; // Copy nums[i+n] to ans
        }

        return ans;
    }
} 

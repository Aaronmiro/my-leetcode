//Given an integer array nums of length n where all the integers of nums are in 
//the range [1, n] and each integer appears once or twice, return an array of all 
//the integers that appears twice. 
//
// You must write an algorithm that runs in O(n) time and uses only constant ext
//ra space. 
//
// 
// Example 1: 
// Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
// Example 2: 
// Input: nums = [1,1,2]
//Output: [1]
// Example 3: 
// Input: nums = [1]
//Output: []
// 
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 105 
// 1 <= nums[i] <= n 
// Each element in nums appears once or twice. 
// 
// Related Topics Array Hash Table 
// 👍 3802 👎 187

package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class FDSolution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while ((i + 1) != nums[i] && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)){
                result.add(nums[i]);
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
//        int[] nums2 = {1,1,2};
//        int[] nums3 = {1};
//        Solution solution = new Solution();
//        System.out.println(solution.findDuplicates(nums3));
//    }
}
//leetcode submit region end(Prohibit modification and deletion)


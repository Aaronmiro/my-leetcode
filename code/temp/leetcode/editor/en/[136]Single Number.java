//Given a non-empty array of integers nums, every element appears twice except 
//for one. Find that single one. 
//
// You must implement a solution with a linear runtime complexity and use only 
//constant extra space. 
//
// 
// Example 1: 
// Input: nums = [2,2,1]
//Output: 1
// Example 2: 
// Input: nums = [4,1,2,1,2]
//Output: 4
// Example 3: 
// Input: nums = [1]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -3 * 10⁴ <= nums[i] <= 3 * 10⁴ 
// Each element in the array appears twice except for one element which appears 
//only once. 
// 
// Related Topics Array Bit Manipulation 👍 7193 👎 234

package leetcode.editor.en;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class SNSolution {
    public int singleNumber(int[] nums) {
//        int result = Integer.MAX_VALUE;
//        Set<Integer> set =  new HashSet<>(1);
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.contains(nums[i])){
//                set.add(nums[i]);
//            }else set.remove(nums[i]);
//        }
//        for (Integer integer : set) {
//             result = integer;
//        }
//        return result;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        SNSolution snSolution = new SNSolution();
        snSolution.singleNumber(nums);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

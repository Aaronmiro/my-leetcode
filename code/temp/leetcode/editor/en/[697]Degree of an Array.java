//Given a non-empty array of non-negative integers nums, the degree of this 
//array is defined as the maximum frequency of any one of its elements. 
//
// Your task is to find the smallest possible length of a (contiguous) subarray 
//of nums, that has the same degree as nums. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,2,3,1]
//Output: 2
//Explanation: 
//The input array has a degree of 2 because both elements 1 and 2 appear twice.
//Of the subarrays that have the same degree:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//The shortest length is 2. So return 2.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,2,3,1,4,2]
//Output: 6
//Explanation: 
//The degree is 3 because the element 2 is repeated 3 times.
//So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
// 
//
// 
// Constraints: 
//
// 
// nums.length will be between 1 and 50,000. 
// nums[i] will be an integer between 0 and 49,999. 
// 
// Related Topics Array Hash Table 👍 1576 👎 1070


package leetcode.editor.en;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class DASolution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> left = new HashMap(),
                right = new HashMap(),
                count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,2,3};
        DASolution daSolution = new DASolution();
        daSolution.findShortestSubArray(nums);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

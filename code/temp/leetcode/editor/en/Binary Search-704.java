//Given an array of integers nums which is sorted in ascending order, and an int
//eger target, write a function to search target in nums. If target exists, then r
//eturn its index. Otherwise, return -1. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
// 
//
// Example 2: 
//
// 
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 104 
// -104 < nums[i], target < 104 
// All the integers in nums are unique. 
// nums is sorted in ascending order. 
// 
// Related Topics Array Binary Search 
// 👍 1488 👎 67

package leetcode.editor.en;

//leetcode submit region begin(Prohibit modification and deletion)
class SSolution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;

        while (left <= right) {
            int length = right - left + 1;
            if (length % 2 == 0) middle = length / 2 + left;
            else middle = (length - 1) / 2 + left;

            if (target - nums[middle] == 0) {
                return middle;
            } else if (target - nums[middle] > 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

//    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,7,9,10};
//        Solution solution = new Solution();
//        System.out.println(solution.search(nums, 1));
//        System.out.println(solution.search(nums, 2));
//        System.out.println(solution.search(nums, 3));
//        System.out.println(solution.search(nums, 4));
//        System.out.println(solution.search(nums, 7));
//        System.out.println(solution.search(nums, 9));
//        System.out.println(solution.search(nums, 10));
//        System.out.println(solution.search(nums, 8));
//    }
}
//leetcode submit region end(Prohibit modification and deletion)


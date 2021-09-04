//Given an array of integers nums sorted in ascending order, find the starting a
//nd ending position of a given target value. 
//
// If target is not found in the array, return [-1, -1]. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
// Example 2: 
// Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
// Example 3: 
// Input: nums = [], target = 0
//Output: [-1,-1]
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// nums is a non-decreasing array. 
// -109 <= target <= 109 
// 
// Related Topics Array Binary Search 
// 👍 6091 👎 212

package leetcode.editor.en;

//leetcode submit region begin(Prohibit modification and deletion)
class SASolution {
//    public int[] searchRange(int[] nums, int target) {
//        int[] result = {-1,-1};
//        int length = nums.length;
//        boolean isFirst = true;
//        if (length != 0){
//            for (int i = 0; i < length; i++) {
//                if (target == nums[i]){
//                    if (isFirst){
//                        result[0] = i;
//                        isFirst = false;
//                    }
//                    result[1] = i;
//                }
//            }
//        }
//        return result;
//    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] nums = {5,7,7,8,8,8};
//        System.out.println(Arrays.toString(solution.searchRange(nums, 6)));
//    }

    //https://blog.csdn.net/qq_41231926/article/details/82584821
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = floor(nums, target);
        result[1] = ceil(nums, target);
        return result;
    }

    private int floor(int[] nums, int target) {
        int left = -1;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        if (left + 1 < nums.length && nums[left + 1] == target) {
            return left + 1;
        } else {
            return -1;
        }
    }

    private int ceil(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target >= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (right - 1 >= 0 && nums[right - 1] == target) {
            return right - 1;
        } else {
            return -1;
        }
    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] nums = {5,7,7,8,8,8};
//        System.out.println(Arrays.toString(solution.searchRange(nums, 7)));
//    }
}
//leetcode submit region end(Prohibit modification and deletion)


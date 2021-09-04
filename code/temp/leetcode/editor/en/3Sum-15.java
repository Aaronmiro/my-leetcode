//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k
//]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
//
// Notice that the solution set must not contain duplicate triplets. 
//
// 
// Example 1: 
// Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
// Example 2: 
// Input: nums = []
//Output: []
// Example 3: 
// Input: nums = [0]
//Output: []
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics Array Two Pointers Sorting 
// 👍 11295 👎 1126

package leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class ThreeSumSolution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) { //排序后如果最小的数>0，就直接退出
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {  //去重操作
                continue;
            }
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex) {
                int currentNum = nums[i];
                int leftNum = nums[leftIndex];
                int rightNum = nums[rightIndex];
                if ((currentNum + leftNum + rightNum) == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(currentNum);
                    temp.add(leftNum);
                    temp.add(rightNum);
                    result.add(temp);

                    //去重操作
                    while (rightIndex > leftIndex && rightNum == nums[rightIndex - 1]) {
                        rightIndex--;
                    }
                    while (rightIndex > leftIndex && leftNum == nums[leftIndex + 1]) {
                        leftIndex++;
                    }
                    rightIndex--;
                    leftIndex++;

                } else if ((currentNum + leftNum + rightNum) < 0) {
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        int[] nums = {-1, -1, 0, 0, 0, 0, 0, 1, 1};
//        //int[] nums = {0,0,0,0};
//        System.out.println(threeSum(nums));
//
//    }
}
//leetcode submit region end(Prohibit modification and deletion)


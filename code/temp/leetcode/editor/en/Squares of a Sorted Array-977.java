//Given an integer array nums sorted in non-decreasing order, return an array 
//of the squares of each number sorted in non-decreasing order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
// 
//
// Example 2: 
//
// 
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums is sorted in non-decreasing order. 
// 
//
// 
//Follow up: Squaring each element and sorting the new array is very trivial, 
//could you find an O(n) solution using a different approach? Related Topics Array 
//Two Pointers Sorting 👍 3131 👎 121

package leetcode.editor.en;
//leetcode submit region begin(Prohibit modification and deletion)
class SSASolution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int resIdx = length -1;
        int firstIdx = 0;
        int lastIdx = length -1;
        for(;resIdx >=0; resIdx--){
            int first = nums[firstIdx]*nums[firstIdx];
            int last = nums[lastIdx]*nums[lastIdx];
            if(first < last) {
                result[resIdx] = last;
                lastIdx--;
            }
            else {
                result[resIdx] = first;
                firstIdx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,-1,0,3,10};
        SSASolution ssaSolution = new SSASolution();
        ssaSolution.sortedSquares(nums);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics String 👍 5419 👎 2489

package leetcode.editor.en;

//leetcode submit region begin(Prohibit modification and deletion)
class LSPSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String first = strs[0];

        for (int i = 0; i < strs.length - 1; i++) {
            first = compare(first, strs[i + 1]);
        }
        return first;
    }

    public String compare(String one, String two) {
        int min = Math.min(one.length(), two.length());
        if (min == 0) return "";
        for (int i = 0; i < min; i++) {
            if (one.charAt(i) != two.charAt(i)) {
                return one.substring(0, i);
            }
        }
        return min == one.length() ? one : two;
    }

    public static void main(String[] args) {
        String[] strs = {"dog", "racecar", "car"};
        LSPSolution lspSolution = new LSPSolution();
        String s = lspSolution.longestCommonPrefix(strs);
        System.out.println(s);


    }
}
//leetcode submit region end(Prohibit modification and deletion)

//Given a string containing digits from 2-9 inclusive, return all possible lette
//r combinations that the number could represent. Return the answer in any order. 
//
//
// A mapping of digit to letters (just like on the telephone buttons) is given b
//elow. Note that 1 does not map to any letters. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// Example 2: 
//
// 
//Input: digits = ""
//Output: []
// 
//
// Example 3: 
//
// 
//Input: digits = "2"
//Output: ["a","b","c"]
// 
//
// 
// Constraints: 
//
// 
// 0 <= digits.length <= 4 
// digits[i] is a digit in the range ['2', '9']. 
// 
// Related Topics Hash Table String Backtracking 
// 👍 6451 👎 542

package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    String[] numString = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//
//    public List<String> letterCombinations(String digits) {
//        String[] current = new String[digits.length()];
//
//        List<String> result = new ArrayList<>();
//        if (digits.length() == 0) return result;
//        letterCombinationsHelper(0, digits, current, result);
//        return result;
//    }
//
//    public void letterCombinationsHelper(int idx, String digits, String[] current, List<String> result) {
//        if (idx == digits.length()) {
//            String join = String.join("", current); //分隔符为空，所以直接拼接
//            result.add(join);
//        } else {
//            char digit = digits.charAt(idx);
//            String letters = numString[digit - '0'];
//            for (int i = 0; i < letters.length(); i++) {
//                current[idx] = String.valueOf(letters.charAt(i));
//                letterCombinationsHelper(idx + 1, digits, current, result);
//            }
//        }
//    }
//}
class LCSolution {
    //设置全局列表存储最后的结果
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        //初始对应所有的数字
        String[] numString = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //迭代处理
        backTracking(digits, numString, 0);
        return result;

    }

    //每次迭代获取一个字符串，所以会设计大量的字符串拼接，所以这里选择更为高效的 StringBuild
    StringBuilder current = new StringBuilder();

    //比如digits如果为"23",idx 为0，则str表示2对应的 abc
    public void backTracking(String digits, String[] numString, int idx) {
        //遍历全部一次记录一次得到的字符串
        if (idx == digits.length()) {
            result.add(current.toString());
            return;
        }
        //str 表示当前idx对应的字符串
        String str = numString[digits.charAt(idx) - '0'];
        for (int i = 0; i < str.length(); i++) {
            current.append(str.charAt(i));

            backTracking(digits, numString, idx + 1);
            //剔除末尾的继续尝试
            current.deleteCharAt(current.length() - 1);
        }
    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        List<String> strings = solution.letterCombinations("1905");
//        System.out.println(strings);
//    }
}
//leetcode submit region end(Prohibit modification and deletion)


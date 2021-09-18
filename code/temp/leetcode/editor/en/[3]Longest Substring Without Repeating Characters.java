//Given a string s, find the length of the longest substring without repeating 
//characters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// Example 4: 
//
// 
//Input: s = ""
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s consists of English letters, digits, symbols and spaces. 
// 
// Related Topics Hash Table String Sliding Window 👍 17249 👎 816


//leetcode submit region begin(Prohibit modification and deletion)
package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LSWRCSolution {
    public int lengthOfLongestSubstring(String s) {

//        int result = 0;
//        Set<Character> set = new HashSet<>();
//
//        for (int left = 0; left < s.length(); left++) {
//            set.clear();
//            int right = left;
//            while (right < s.length() && !set.contains(s.charAt(right))) {
//                set.add(s.charAt(right));
//                right++;
//            }
//            result = Math.max((right - left), result);
//        }
//        return result;

        int result = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < length; j++) {
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j-i +1);
            map.put(s.charAt(j),j+1);
        }
        return result;

    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s = "bbbbb";
        LSWRCSolution lswrcSolution = new LSWRCSolution();
        System.out.println(lswrcSolution.lengthOfLongestSubstring(s));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

//Given a string s, find the first non-repeating character in it and return its 
//index. If it does not exist, return -1. 
//
// 
// Example 1: 
// Input: s = "leetcode"
//Output: 0
// Example 2: 
// Input: s = "loveleetcode"
//Output: 2
// Example 3: 
// Input: s = "aabb"
//Output: -1
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s consists of only lowercase English letters. 
// 
// Related Topics Hash Table String Queue Counting 👍 3456 👎 165


package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class FUCSolution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!map.containsKey(current)){
                map.put(current,1);
            }else map.put(current,map.get(current)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.get(current)==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "aabb";
        String s3 = "loveleetcode";
        FUCSolution fucSolution = new FUCSolution();
        System.out.println(fucSolution.firstUniqChar(s3));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

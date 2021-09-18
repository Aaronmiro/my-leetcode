//Write a function that reverses a string. The input string is given as an 
//array of characters s. 
//
// 
// Example 1: 
// Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
// Example 2: 
// Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] is a printable ascii character. 
// 
//
// 
// Follow up: Do not allocate extra space for another array. You must do this 
//by modifying the input array in-place with O(1) extra memory. 
// Related Topics Two Pointers String Recursion 👍 2940 👎 832


//leetcode submit region begin(Prohibit modification and deletion)
package leetcode.editor.en;
class RSSolution {
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;
        while(first<=last){
            char tmp = s[first];
            s[first] = s[last];
            s[last] = tmp;
            first++;
            last--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

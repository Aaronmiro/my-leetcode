//Given a linked list, swap every two adjacent nodes and return its head. You 
//must solve the problem without modifying the values in the list's nodes (i.e., 
//only nodes themselves may be changed.) 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
// 
//
// Example 2: 
//
// 
//Input: head = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 100]. 
// 0 <= Node.val <= 100 
// 
// Related Topics Linked List Recursion 👍 4618 👎 245


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package leetcode.editor.en;

import JZ.tools.ListNode;

class SNPSolution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode prePreNode = null;
        ListNode preNode = head;
        ListNode curNode = preNode.next;
        ListNode nextNode = curNode.next;

        while (curNode != null) {
            if (preNode == head) head = curNode;
            else prePreNode.next = curNode;
            curNode.next = preNode;
            preNode.next = nextNode;

            prePreNode = preNode;
            preNode = nextNode;
            if (preNode == null || preNode.next == null) break;
            curNode = preNode.next;
            nextNode = curNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        new SNPSolution().swapPairs(node1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

//Given the head of a linked list, remove the nᵗʰ node from the end of the list 
//and return its head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1], n = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1,2], n = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is sz. 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
// Follow up: Could you do this in one pass? 
// Related Topics Linked List Two Pointers 👍 6786 👎 357

package leetcode.editor.en;
//leetcode submit region begin(Prohibit modification and deletion)

import JZ.tools.ListNode;

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
class RNNFESolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = this.findTotal(head, 0);
        int idx = total - n;
        if (idx==0) {
            if (head.next != null) head = head.next;
            else head = null;
        }
        else removeOne(head,0,idx);
        return head;
    }

    private int findTotal(ListNode node, int total) {
        if (node == null) return total;
        return this.findTotal(node.next, ++total);
    }

    private void removeOne(ListNode node, int i, int idx) {
        if (i == (idx - 1)) {
            ListNode tmp = node.next.next;
            node.next.next = null;
            node.next = tmp;
        }else removeOne(node.next,++i,idx);
    }


    public static void main(String[] args) {
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode2);


//        ListNode listNode = new ListNode(1, null);
        RNNFESolution rnnfeSolution = new RNNFESolution();
        rnnfeSolution.removeNthFromEnd(listNode1, 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

package JZ.tools;

/**
 * @author Aaron
 * @date 2021/6/29 10:31
 */
public class ListNode {
    public int val;
    public ListNode next = null;
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

package basic.linkedlist;

import JZ.tools.ListNode;

/**
 * @author Aaron
 * @date 9/28/21 11:18 AM
 */
public interface AaronList<T> {
    void append(T val);
    void prepend(T val);
    void insertAfter(T cur, T val);
    void remove(T val);
    T search(ListNode node, T val);
    void print(ListNode node);
    void printReverse(ListNode node);
    void sort(ListNode node);
    boolean isEmpty(ListNode node);
    int getLength(ListNode node);

}

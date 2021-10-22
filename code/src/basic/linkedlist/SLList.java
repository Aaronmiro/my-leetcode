package basic.linkedlist;

import JZ.tools.ListNode;

import java.util.List;

/**
 * @author Aaron
 * @date 9/28/21 11:28 AM
 */
public class SLList<T> implements AaronList<T> {
    private ListNode head;
    private ListNode tail;


    private ListNode findCurNode(T cur) {
        ListNode curNode = head;
        while (curNode != null) {
            if (curNode.val == (int) cur) return curNode;
            curNode = curNode.next;
        }
        return curNode;

    }

    @Override
    public void append(T val) {
        ListNode node = new ListNode((int) val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    @Override
    public void prepend(T val) {
        ListNode node = new ListNode((int) val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void insertAfter(T cur, T val) {
        ListNode node = new ListNode((int) val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else if (this.tail.val == (int) cur) {
            this.tail.next = node;
            this.tail = node;
        } else {
            ListNode curNode = findCurNode(cur);
            if (curNode != null) {
                node.next = curNode.next;
                curNode.next = node;
            }
        }
    }

    @Override
    public void remove(T val) {

    }


    public void removeAfter(T val) {

    }

    @Override
    public T search(ListNode node, T val) {
        return null;
    }

    @Override
    public void print(ListNode node) {

    }

    @Override
    public void printReverse(ListNode node) {

    }

    @Override
    public void sort(ListNode node) {

    }

    @Override
    public boolean isEmpty(ListNode node) {
        return false;
    }

    @Override
    public int getLength(ListNode node) {
        return 0;
    }
}

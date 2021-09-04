package JZ;

import JZ.tools.ListNode;

import java.util.ArrayList;

/**
 * @author Aaron
 * @date 2021/6/29 10:26
 */

public class JZ3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        printHelper(listNode, arrayList);
        return arrayList;
    }

    public void printHelper(ListNode listNode, ArrayList<Integer> arrayList) {
        if (listNode == null) {
            return;
        }
        printHelper(listNode.next, arrayList);
        arrayList.add(listNode.val);
    }

//    ArrayList<Integer> list = new ArrayList();
//
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        if (listNode != null) {
//            printListFromTailToHead(listNode.next);
//            list.add(listNode.val);
//        }
//        return list;
//    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode = new ListNode();
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        JZ3 jz3 = new JZ3();
        ArrayList<Integer> integers = jz3.printListFromTailToHead(listNode1);
        System.out.println(integers);
    }
}

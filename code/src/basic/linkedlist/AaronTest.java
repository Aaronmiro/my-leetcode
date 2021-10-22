package basic.linkedlist;

/**
 * @author Aaron
 * @date 9/28/21 11:34 AM
 */
public class AaronTest {
    public static void main(String[] args) {
        SLList<Integer> slList = new SLList();
        slList.append(1);
        slList.append(2);
        slList.append(3);
        slList.append(4);
        slList.prepend(0);
        slList.prepend(-2);
        slList.insertAfter(0,100);
    }
}

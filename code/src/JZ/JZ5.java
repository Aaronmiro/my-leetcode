package JZ;

import JZ.tools.TreeLinkNode;

/**
 * @author Aaron
 * @date 2021/7/3 11:14
 */
public class JZ5 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        // 1. 有右子树，下一结点是右子树中的最左结点
        if (pNode.right != null) {
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null) {
                pRight = pRight.left;
            }
            return pRight;
        }
        // 2. 无右子树，且结点是该结点父结点的左子树
        if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        }
        // 3. 无右子树，且结点是该结点父结点的右子树，则我们一直沿着父结点追朔，直到找到某个结点是其父结点的左子树，如果存在这样的结点，那么这个结点的父结点就是我们要找的下一结点
        if (pNode.next != null) {
            TreeLinkNode pNext = pNode.next;
            while (pNext.next != null && pNext.next.right == pNext) {
                pNext = pNext.next;
            }
            return pNext.next;
        }
        return null;
    }
}

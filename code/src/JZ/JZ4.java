package JZ;

import JZ.tools.TreeNode;

/**
 * @author Aaron
 * @date 2021/7/2 10:38
 */
public class JZ4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) return null;
        TreeNode treeNode = new TreeNode(pre[0]);
        return reConstructBinaryTreeHelper(treeNode, pre, in);
    }

    public TreeNode reConstructBinaryTreeHelper(TreeNode treeNode, int[] pre, int[] in) {
        int i;
        int length = in.length;
        for (i = 0; i < length; i++) {
            if (in[i] == pre[0]) break;
        }
        int[] newPreLeft = constructInts(pre, i, 1);
        int[] newInLeft = constructInts(in, i, 0);
        int[] newPreRight = constructInts(pre, length - i - 1, 1 + i);
        int[] newInRight = constructInts(in, length - i - 1, 1 + i);

        if (newPreLeft.length != 0 || newInLeft.length != 0) {
            treeNode.left = new TreeNode(newPreLeft[0]);
            reConstructBinaryTreeHelper(treeNode.left, newPreLeft, newInLeft);
        }
        if (newPreRight.length != 0 || newInRight.length != 0) {
            treeNode.right = new TreeNode(newPreRight[0]);
            reConstructBinaryTreeHelper(treeNode.right, newPreRight, newInRight);
        }
        return treeNode;
    }

    public int[] constructInts(int[] ints, int idx, int start) {
        int[] newInts = new int[idx];
        for (int i = 0; i < idx; i++) {
            newInts[i] = ints[start + i];
        }
        return newInts;
    }

    public static void main(String[] args) {

        int[] pre1 = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in1 = {4, 7, 2, 1, 5, 3, 8, 6};

        int[] pre2 = {1, 2, 3, 4, 5, 6, 7};
        int[] in2 = {3, 2, 4, 1, 6, 5, 7};

        JZ4 jz4 = new JZ4();
        TreeNode treeNode = jz4.reConstructBinaryTree(pre2, in2);
    }
}

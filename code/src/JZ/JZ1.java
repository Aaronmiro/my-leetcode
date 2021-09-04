package JZ;
//二维数组中的查找
//描述
//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
//请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
//[
//[1,2,8,9],
//[2,4,9,12],
//[4,7,10,13],
//[6,8,11,15]
//]
//给定 target = 7，返回 true。
//给定 target = 3，返回 false。


/**
 * @author Aaron
 * @date 2021/6/28 11:19
 */
public class JZ1 {

    public boolean Find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0) return false;
        int lineNum = 0;

        int[] zeroLine = array[lineNum];
        int idx = zeroLine.length - 1;
        int current = zeroLine[idx];

        while (idx >= 0) {
            if (target == current) {
                return true;
            } else if (target < current) {
                if (idx - 1 < 0) return false;
                current = array[lineNum][--idx];
            } else {
                if (lineNum + 1 > array.length - 1) return false;
                current = array[++lineNum][idx];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int[][] array1 = {{}};
        JZ1 jz1 = new JZ1();
        System.out.println(jz1.Find(0, array));
    }
}

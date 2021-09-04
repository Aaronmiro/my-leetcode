package JZ;
//替换空格
//描述
//    请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
/**
 * @author Aaron
 * @date 2021/6/28 15:56
 */
public class JZ2 {
    public String replaceSpace(String s) {
        // write code here
        if (s == null) return null;
        int SLengh = s.length();
        int newNum = SLengh + 2 * getSpaceNum(s);
        String[] newStr = new String[newNum];
        if (SLengh == 0) return String.join("", newStr);
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                newStr[idx++] = String.valueOf('%');
                newStr[idx++] = String.valueOf('2');
                newStr[idx++] = String.valueOf('0');
            } else newStr[idx++] = String.valueOf(s.charAt(i));

        }
        return String.join("", newStr);
    }

    private int getSpaceNum(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        JZ2 jz2 = new JZ2();
        String s1 = "we are happy";
        String s2 = " we are happy";
        String s3 = "we are happy ";
        String s4 = "we are  happy";
        String s5 = "wearehappy";
        String s6 = "";
        String s7 = null;
        String s8 = " ";
        String s9 = "  ";

        System.out.println(jz2.replaceSpace(s1));
        System.out.println(jz2.replaceSpace(s2));
        System.out.println(jz2.replaceSpace(s3));
        System.out.println(jz2.replaceSpace(s4));
        System.out.println(jz2.replaceSpace(s5));
        System.out.println(jz2.replaceSpace(s6));
        System.out.println(jz2.replaceSpace(s7));
        System.out.println(jz2.replaceSpace(s8));
        System.out.println(jz2.replaceSpace(s9));
    }
}

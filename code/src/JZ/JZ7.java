package JZ;

/**
 * @author Aaron
 * @date 2021/7/3 15:44
 */
public class JZ7 {
    public int Fibonacci(int n) {
        if (n < 2) return n;

        int first = 0;
        int second = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        JZ7 jz7 = new JZ7();
        for (int i = 0; i < 13; i++) {
            System.out.println(jz7.Fibonacci(i));
        }
    }
}

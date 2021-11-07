/**
 * 阶乘：n!
 * 例： 3! = 1*2*3
 */
public class Factorial01 {
    public static void main(String[] args) {
        System.out.println(getFactorial(5)); // 6
    }

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n*getFactorial(n - 1); // n! = n*(n-1)!
    }
}


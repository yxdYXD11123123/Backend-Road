public class Fibonacci02 {
    public static void main(String[] args) {
        int num = getFibonacci(6);
        System.out.println(num); // 8
    }

    public static int getFibonacci(int n) {
        // 找到 1 或 2 时，就可以归了
       if (n==1||n==2) {
           return 1;
       }
       // f(n)是f(n-1)+f(n-2)
       return getFibonacci(n-1) + getFibonacci(n-2);
    }
}

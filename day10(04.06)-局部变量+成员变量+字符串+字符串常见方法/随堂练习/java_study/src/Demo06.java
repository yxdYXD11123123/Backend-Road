public class Demo06 {
    static int a = 1;
    public static void main(String[] args) {
        run(a++); // 执行完函数 再 自增
        System.out.println(a);
    }
    public static void run(int a) {
        System.out.println(a);
    }
}

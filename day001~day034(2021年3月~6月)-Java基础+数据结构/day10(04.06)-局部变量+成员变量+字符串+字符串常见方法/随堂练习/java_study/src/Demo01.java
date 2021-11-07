public class Demo01 {
    // 成员变量
    static int num = 0;

    public static void main(String[] args) {
        // 局部变量
        int num = 1;
        System.out.println(num);
        // 直属调用  类名.成员变量
        System.out.println(Demo01.num);
    }
}


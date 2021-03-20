public class Demo6 {
    public static void main(String[] args) {
        // char保存单个字符 2个字节 必须使用单引号
        char a1 = '曾';
        System.out.println(a1);  // 曾
        // 注意事项：若将单字符保存为整数，保存的是：
        // 该字符在计算机 文字表上的位置（码表上的位置）
        int a2 = '曾';
        System.out.println(a2);  // 26366

        // 还可以保存转义字符
        // 区别于普通计算机字符，需要通过\转义，转义字符相当于一个字符
        // TAB(制表符) \t
        char c3 = '\t';
        System.out.println(c3);
        char c4 = '\'';
        System.out.println(c4);
        // String类型：字符串类型，专门用于保存多个字符
        // 必须使用双引号
        String s1 = "frank";
        System.out.println(s1);
        // 可以保存空字符
        String s2 = "";
        System.out.println(s2);

        // 布尔值类型  1字节
        boolean f1 = true;
        System.out.println(f1);
        boolean f2 = false;
        System.out.println(f2);
    }
}

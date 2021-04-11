public class Stuff {
    public static String str = "我是静态成员变量";
     String str2 = "我是成员变量";
    public void run() {
        System.out.println(str); // "我是静态成员变量"
        String str = "我是局部变量";
        System.out.println(str); // "我是局部变量"
        System.out.println(this.str2); //  我是成员变量
    }
}

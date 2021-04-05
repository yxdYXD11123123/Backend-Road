public class Demo04 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        a = b++;
        System.out.println(a++ + ++b);
        System.out.println(a);
        System.out.println(b);
    }
}
//liuyu 18:14:42 (多人发送)
//        1、
//        int a = 10;
//        a = a++ + ++a;
//        System.out.println(a);
//
//        2、
//        int a = 10;
//        a = ++a + a++;
//        System.out.println(a);
//
//        3、
//        int a = 10;
//        a = ++a - a--;
//        System.out.println(a);
//        4、
//        int a = 10;
//        a = a++ - --a;
//        System.out.println(a);
//        liuyu 18:22:52 (多人发送)
//        1、
//        int a = 10;
//        a = a++ + --a;
//        System.out.println(a++);
//        System.out.println(a);
//
//        2、
//        int a = 10;
//        int b = a++;
//        a = b++;
//        System.out.println(a++ + ++b);
//        System.out.println(a);
//        System.out.println(b);
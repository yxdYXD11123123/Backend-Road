public class Demo3 {
    public static void main(String[] args) {
        // 方式一：
        // 先一次定义多个，再依次赋值
        int a = 200, b, c, d, e;
        a = 100;
        b = 200;
        c = 300;
        d = 400;
        e = 500;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // 方式二：
        int f = 100, g = 200, h = 300, i = 400, j = 500;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}

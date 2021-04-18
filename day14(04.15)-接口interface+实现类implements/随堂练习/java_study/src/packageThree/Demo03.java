package packageThree;

public class Demo03 {
    public static void main(String[] args) {
        Fruits apple = new Fruits();
        // 调用
        apple.defaultFn(); // 我是实现类重写的接口的默认方法
        apple.abstractFn(); // 我是实现类Fruits中，实现的接口规定的抽象方法
        Food.staticFn(); // 我是Food接口的静态方法，通过接口名访问
    }
}

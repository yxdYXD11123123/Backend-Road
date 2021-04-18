package packageThree;

public class Fruits implements Food {
    // 重写接口默认方法，可重写可不重写
    @Override
    public void defaultFn() {
        System.out.println("我是实现类重写的接口的默认方法");
    }

    // 重写接口抽象方法，必须重写
    @Override
    public void abstractFn() {
        System.out.println("我是实现类Fruits，实现了接口规定的抽象方法");
    }
}

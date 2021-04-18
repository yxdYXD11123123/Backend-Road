package packageThree;

public interface Food {
    // 静态方法
    static void staticFn() {
        System.out.println("我是Food接口的静态方法，通过接口名访问");
    }
    // 抽象方法（通过 实现类去实现抽象方法）
    void abstractFn();
    // 默认方法
    default void defaultFn() {
        System.out.println("我是Food接口的默认方法");
    }
}

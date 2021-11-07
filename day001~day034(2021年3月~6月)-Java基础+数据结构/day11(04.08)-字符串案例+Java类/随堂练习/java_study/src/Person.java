public class Person {
    public int age = 10;
    public void eat() {
        System.out.println("吃");
        fn1();
    }
    public static void fn1() {
        System.out.println("方法");
    }
}

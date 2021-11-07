public interface B {
    String Name = "1";
    public static void run2() {
        System.out.println("run2");
    }
    public default void run1() {
        System.out.println("run1");
    }
    void fn();
}

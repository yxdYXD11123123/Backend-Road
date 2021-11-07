public class Guy {
    private int age;
    public static String str = "我是静态成员变量";

    private String name = "家伙";
    // 通过 get 方法获取
    public int getAge() {
        // 未来 在这里 校验权限
        return age;
    }
    // 通过 set 方法赋值
    public void setAge(int age) {
        // 未来 在这里 校验权限
        this.age = age;
    }
}

public class C {
    private String n1;
    private String n2;
    private String n3;

    public C(String n1, String n2, String n3) {
        System.out.println("构造方法一");
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public C() {
        System.out.println("构造方法二");
    }
}

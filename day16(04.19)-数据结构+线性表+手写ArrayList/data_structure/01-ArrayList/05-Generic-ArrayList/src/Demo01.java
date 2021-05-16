public class Demo01 {
    public static void main(String[] args) {
        Array<Student> list = new Array<>(4);
        Student s1 = new Student("frank");
        Student s2 = new Student("lindy");
        list.add(0,s1);
        list.add(0,s2);
        System.out.println(list);
    }
}

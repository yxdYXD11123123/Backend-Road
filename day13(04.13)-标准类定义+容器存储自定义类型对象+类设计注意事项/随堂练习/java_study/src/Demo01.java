public class Demo01 {
    public static void main(String[] args) {
        Student s1 = new Student("frank","男",99, "yang");
        System.out.println(s1.getScore()); // 99

        Student s2 = new Student();
        s2.setScore(88);
        System.out.println(s2.getScore()); // 88
        // 由于println的默认机制，打印对象时会默认触发对象的toString方法
        System.out.println(s2);  // Student{sname='null', sex='null', score=88, tname='null'}
    }
}

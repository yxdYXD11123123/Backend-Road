public class Demo02 {
    public static void main(String[] args) {
        Student s1 = new Student("franka", "男", 99,"");
        Student s2 = new Student("frankb", "男", 98,"");
        Student s3 = new Student("frankc", "男", 97,"");

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Student[] students1 = {s1, s2, s3};
        for (int i = 0; i < students1.length; i++) {
            System.out.println(students1[i]);
        }
    }
}

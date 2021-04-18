import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {
    public static void main(String[] args) {
        Student s1 = new Student("franka", "男", 99, "");
        Student s2 = new Student("frankb", "男", 98, "");
        Student s3 = new Student("frankc", "男", 97, "");

        // 创建集合
        ArrayList<Student> slist = new ArrayList<>();

        // 依次添加
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);

        // 或者 一起添加
        Collections.addAll(slist,
                new Student("franka", "男", 99, ""),
                new Student("frankb", "男", 98, ""),
                new Student("frankb", "男", 98, "")
                );

        // 遍历
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
        }
    }
}

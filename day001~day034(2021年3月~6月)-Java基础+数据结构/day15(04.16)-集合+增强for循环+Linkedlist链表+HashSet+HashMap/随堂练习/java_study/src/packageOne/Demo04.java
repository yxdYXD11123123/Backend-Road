package packageOne;

import java.util.HashSet;

public class Demo04 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean f1 = set.add("frank");
        System.out.println(f1); // true 意味着添加成功
        boolean f2 = set.add("frank");
        System.out.println(f2); // false 意味着添加失败
        System.out.println(set); // [frank]
        // 是否为空
        System.out.println(set.isEmpty()); // false

        // 删除
        boolean f3 = set.remove("frank");
        System.out.println(f3); // true 代表删除成功
        System.out.println(set); //  []

        set.add("new");
        // 清空
        set.clear();
        System.out.println(set);


    }
}

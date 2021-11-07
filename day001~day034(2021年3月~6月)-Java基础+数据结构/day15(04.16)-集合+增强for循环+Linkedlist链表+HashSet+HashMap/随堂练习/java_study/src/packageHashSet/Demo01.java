package packageHashSet;

import java.util.Collections;
import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        Collections.addAll(hSet, "袁", "旭", "东");
        System.out.println(hSet); //  [袁, 东, 旭]   是无序的
//      获取元素个数
        System.out.println(hSet.size());  // 3

//        System.out.println(hSet.isEmpty());
        hSet.add("frank");
        System.out.println(hSet); // [frank, 袁, 东, 旭]

        hSet.remove("旭");
        System.out.println(hSet); // [frank, 袁, 东]

//        hSet.clear();
//        System.out.println(hSet); // []

        for (String s : hSet) {
            System.out.println(s);
        }
    }
}

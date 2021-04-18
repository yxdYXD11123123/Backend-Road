package packageArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4);
        System.out.println(list); // [1, 2, 3, 4]
        // 使用add 在索引为2的位置添加元素 99
        list.add(2, 99);
        System.out.println(list); // [1, 2, 99, 3, 4]
        // 使用remove 删除索引为3的元素
        list.remove(3);
        System.out.println(list); // [1, 2, 99, 4]


    }
}

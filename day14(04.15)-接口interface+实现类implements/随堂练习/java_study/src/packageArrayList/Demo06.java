package packageArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4);
        // 增强for循环
        // 遍历
        for (Integer val : list) {
            // val 是每次循环的元素
            System.out.println(val);
        }
    }
}

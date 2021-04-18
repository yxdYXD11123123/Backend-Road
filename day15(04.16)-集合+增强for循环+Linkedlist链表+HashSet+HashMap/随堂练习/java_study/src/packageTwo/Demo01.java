package packageTwo;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {
        // 将重复数字保存到一个集合中
        int[] arr = {1,2,3,4,5,4,3,2,1};
        // 定义HashSet和ArrayList集合
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!set.add(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}

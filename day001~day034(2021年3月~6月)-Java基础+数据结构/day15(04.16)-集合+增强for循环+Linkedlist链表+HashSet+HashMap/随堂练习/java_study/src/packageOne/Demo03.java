package packageOne;

import java.util.Collections;
import java.util.LinkedList;

public class Demo03 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list,"a","b","c");
        // 遍历
        for (String s : list) {
            System.out.println(s);
        }
        // 使用ArrayList方法，操作LinkedList
        // LinkedList没有索引，强制使用索引方式进行操作，
        // LinkedList虽然支持，但是底层是模拟索引进行的，效率极低
        System.out.println(list.get(2));
    }
}

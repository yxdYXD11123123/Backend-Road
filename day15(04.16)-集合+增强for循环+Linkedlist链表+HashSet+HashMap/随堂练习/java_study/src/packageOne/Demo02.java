package packageOne;

import java.util.Collections;
import java.util.LinkedList;

public class Demo02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1,2,3);
        System.out.println(list);
        // 获取：没有元素，会报没有那个元素的异常


    }
}

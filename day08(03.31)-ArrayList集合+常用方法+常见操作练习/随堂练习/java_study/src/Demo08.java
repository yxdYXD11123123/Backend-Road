import java.util.ArrayList;
import java.util.Collections;

public class Demo08 {
    public static void main(String[] args) {
        // 在集合中寻找元素x（x可以为任意整数）
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 66, 55, 2, 44, 88, 66);
        // 声明x
        int x = 55;
        // 准备记录元素索引，初始值为-1
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            // 如果找到相同元素
            if (list.get(i) == x) {
                // 记录索引
                index = i;
                // 结束循环，节省效率
                break;
            }
        }
        // 判断结果
        if (index == -1) {
            System.out.println("未找到元素"+x);
        }else {
            System.out.println("元素"+x+"的索引是"+index);
        }
    }
}

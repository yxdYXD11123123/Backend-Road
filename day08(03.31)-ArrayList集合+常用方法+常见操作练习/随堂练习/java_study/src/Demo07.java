import java.util.ArrayList;
import java.util.Collections;

public class Demo07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 66, 55, 2, 44, 88, 66);
        // 声明最大 ，最小数
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }else if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(max);  // 88
        System.out.println(min);  // 1
    }
}

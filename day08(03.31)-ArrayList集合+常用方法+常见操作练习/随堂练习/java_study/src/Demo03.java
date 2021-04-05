import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        // 遍历集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        // 正向遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 逆向遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}

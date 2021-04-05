import java.util.ArrayList;
import java.util.Collections;

public class Demo05 {
    public static void main(String[] args) {
        // 求11,22,33,44,55,66之和
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11,22,33,44,55,66);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}

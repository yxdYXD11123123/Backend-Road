import java.util.ArrayList;
import java.util.Collections;

public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 22, 33, 44, 55, 66);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
//        注意：想要得到小数时，需要使用1.0*
        double avg =1.0 * sum / list.size();
        System.out.println(avg); // 38.5
    }
}

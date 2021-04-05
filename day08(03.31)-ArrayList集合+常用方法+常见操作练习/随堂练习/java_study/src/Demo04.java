import java.util.ArrayList;
import java.util.Collections;

public class Demo04 {
    public static void main(String[] args) {
//        快捷添加
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "aa", "bb");
        System.out.println(strings);
    }
}

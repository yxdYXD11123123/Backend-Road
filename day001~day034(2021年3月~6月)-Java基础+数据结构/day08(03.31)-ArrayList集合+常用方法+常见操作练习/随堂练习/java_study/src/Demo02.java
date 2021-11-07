import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(99);
        System.out.println(list); // [1, 99]
        System.out.println(list.get(1)); // 99
    }
}

package packageOne;

import java.util.LinkedList;

public class Demo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("aa");
        list.addFirst("bbb");
        System.out.println(list);  // [bbb, aa]
    }
}

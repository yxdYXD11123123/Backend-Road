package packageLinkedList;

import java.util.LinkedList;

public class Demo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("first");
        System.out.println(list); // [first]
        list.add(1, "1");
        System.out.println(list); // [first, 1]

        list.addLast("Last");
        System.out.println(list); // [first, 1, Last]
        String first = list.getFirst();
        String last = list.getLast();
        System.out.println(last);

        list.removeFirst();
        System.out.println(list);  // [1,last]
        list.removeLast();
        System.out.println(list);  // [1]

        for (String s : list) {
            System.out.println(s);
        }
    }
}

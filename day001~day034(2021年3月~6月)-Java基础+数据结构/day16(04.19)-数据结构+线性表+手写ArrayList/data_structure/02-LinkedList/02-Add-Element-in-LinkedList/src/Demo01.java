public class Demo01 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addLast("First");
        list.addLast("Second");
        list.addLast("Third");

        list.addFirst("oe");
        list.add(2,"2");
        System.out.println(list);
    }
}

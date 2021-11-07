public class Demo01 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addLast("First");
        list.add(1,"2");
        list.addLast("last");
        System.out.println(list);
    }
}

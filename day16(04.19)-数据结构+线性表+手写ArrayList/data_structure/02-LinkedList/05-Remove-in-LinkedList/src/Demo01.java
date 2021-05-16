public class Demo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("First");
        list.addLast("second");
        list.addLast("Third");
        list.addLast("forth");
        System.out.println(list);
        System.out.println( list.removeElement("forth"));
        list.removeLast();
        list.remove(1);
        list.addLast("111");
        list.addFirst("222");
        System.out.println(list);

    }
}

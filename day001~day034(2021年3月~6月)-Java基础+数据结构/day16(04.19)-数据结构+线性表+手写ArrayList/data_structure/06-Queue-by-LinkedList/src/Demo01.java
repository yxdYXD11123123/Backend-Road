public class Demo01 {
    public static void main(String[] args) {
        LinkedListQueue<String> listQueue = new LinkedListQueue<>();
        listQueue.enqueue("1");
        System.out.println(listQueue);
        listQueue.dequeue();
        System.out.println(listQueue.isEmpty());
        listQueue.enqueue("2");
        listQueue.enqueue("3");
        System.out.println(listQueue.peek());

    }
}

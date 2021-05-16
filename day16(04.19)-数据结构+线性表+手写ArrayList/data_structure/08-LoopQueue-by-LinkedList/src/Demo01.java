public class Demo01 {
    public static void main(String[] args) {
        LoopQueueByLinkedList<String> loopQueueByLinkedList = new LoopQueueByLinkedList<>();
        loopQueueByLinkedList.enqueue("1");
        loopQueueByLinkedList.enqueue("2");
        loopQueueByLinkedList.enqueue("3");
        System.out.println(loopQueueByLinkedList.dequeue());
        System.out.println(loopQueueByLinkedList.dequeue());
        System.out.println(loopQueueByLinkedList.dequeue());
    }
}

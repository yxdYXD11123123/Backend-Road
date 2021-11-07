public class LinkedListQueue<E> implements IQueue<E> {
    private LinkedList<E> linkedList;

    public LinkedListQueue() {
       linkedList = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    // 队首出，队尾进
    public void enqueue(E e) {
        linkedList.addLast(e);
    }

    @Override
    public E dequeue() {
        return linkedList.removeFirst();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}

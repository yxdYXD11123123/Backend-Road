public class LoopQueueByLinkedList<E> implements IQueue<E> {
    // 虚拟头结点
    Node dummyHead;
    // 大小
    int size;
    // 尾结点
    Node tailNode;

    // 使用内部类创建结点类
    private class Node {
        // 元素
        public E e;
        // 下一个节点
        public Node next;
        // 无参构造
        public Node() { }
        // 有参构造
        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    public LoopQueueByLinkedList() {
        dummyHead = new Node();
        dummyHead.next = dummyHead;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public E peek() {
        return dummyHead.next.e;
    }

    // 入队
    @Override
    public void enqueue(E e) {
        if (size==0) {
            tailNode = new Node(e, dummyHead);
            dummyHead.next = tailNode;
        } else {
            tailNode.next = new Node(e, dummyHead);
            tailNode = tailNode.next;
        }
        size++;
    }

    // 出队
    @Override
    public E dequeue() {
        if (size ==0) {
            throw new RuntimeException("无元素");
        }
        Node delNode = dummyHead.next;
        dummyHead.next = delNode.next;
        return delNode.e;
    }
}

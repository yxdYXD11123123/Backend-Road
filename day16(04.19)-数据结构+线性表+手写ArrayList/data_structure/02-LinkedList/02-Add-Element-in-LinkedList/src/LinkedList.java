/**
 * 手写 链表
 *
 * @param <E> 元素类型
 *            <p>
 *            1.创建结点Node：
 *            a. 元素 e
 *            b. next 下一个结点
 *            2.创建LinkedList链表（链表上的一个个元素称为结点，结点是组成链表的基本单位）
 *            a. 头节点 head
 *            b. size 链表上元素的个数
 */
public class LinkedList<E> {
    // 使用内部类创建结点类
    private class Node {
        // 元素
        public E e;
        // 下一个节点
        public Node next;

        // 无参构造
        public Node() {
        }

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

    // 头结点
    private Node head;
    // 多少个元素
    private int size;

    // 尾结点
    private Node end;

    // 获取链表长度
    public int getSize() {
        return size;
    }

    // 链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 头插法
     *
     * @param e
     */
    public void addFirst(E e) {
        // 创建新结点，让新结点指向head，并把新结点作为头结点
        head = new Node(e, head);
        // 维护size
        size++;
    }

    /**
     * 中间插入法
     *
     * @param index 指定索引位置
     * @param e
     */
    public void add(int index, E e) {
        // index 要合法
        if (index < 0 || index > size) {
            throw new RuntimeException("索引非法");
        }
        // index 是否是头尾
        if (index == 0) addFirst(e);
        if (index == size) {
            addLast(e);
        } else {
            // 找到要插入的位置的前一个结点
            Node prev = head;  // index 1
            // 要在 索引3 插入时，索引位置的前一个就是索引2，所以要找第三个元素，那就要从head .next 2次
            // 就要保证循环2次  1、2
            for (int i = 1; i < index; i++) {
                prev = prev.next;
            }
            // 把之前上一个位置的结点的后一个结点记录下来
            Node next = prev.next;
            // 让之前的上一个位置的结点的后一个为新结点，新结点的下一个为之前的下一个结点
            prev.next = new Node(e,next);
            // 维护size
            size++;
        }
    }

    /**
     * 尾插法
     *
     * @param e
     */
    public void addLast(E e) {
        if (size == 0) {
            // 第一个元素 既是头元素也是尾元素
            this.head = new Node(e, null);
            this.end = this.head;
        } else {
            // 给尾元素添加下一个元素
            this.end.next = new Node(e, null);
            // 更新尾元素
            this.end = this.end.next;
        }
        // 维护size
        size++;
    }

    @Override
    public String toString() {
        String str = " [ ";
        // 每个结点
//        if (head != null) {
//            Node nodes = head;
//            str += head + ",";
//            while(nodes.next!=null) {
//                nodes = nodes.next;
//                str += nodes+ (nodes.next!=null?",":"");
//            }
//        }
        // 设定一个遍历的当前结点，head为第一个
        Node cur = head;
        // 当前结点不为空 继续遍历
        while (cur != null) {
            // 先加上当前非空结点的内容
            str += cur + (cur.next != null ? " -> " : "");
            // 让当前结点的next成为下一次循环的当前节点
            cur = cur.next;
        }
        str += " ] ";
        // 返回
        return "LinkedList{" +
                str +
                ", size=" + size +
                '}';
    }
}

/**
 * 手写 链表
 * @param <E> 元素类型
 *
 * 1.创建结点Node：
 *           a. 元素 e
 *           b. next 下一个结点
 * 2.创建LinkedList链表（链表上的一个个元素称为结点，结点是组成链表的基本单位）
 *           a. 头节点 head
 *           b. size 链表上元素的个数
 */
public class LinkedList<E> {
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

    // 头结点
    private Node head;
    // 多少个元素
    private int size;

    // 获取链表长度
    public int getSize() {
        return size;
    }
    // 链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }
}

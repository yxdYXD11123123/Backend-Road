/**
 * 循环队列
 * E[] data 存放元素数组
 * front 和 tail 记录队首 index 和 队尾index
 * capacity 容量
 * size 元素个数
 * <p>
 * 构造方法
 * 空参构造：默认初始化大小为10的队列
 * 带参构造：初始化指定大小的队列
 */
public class ArrayLoopQueeu<E> implements IQueue<E> {
    // 数组
    private E[] data;

    // 首位
    private int front, tail;

    // 长度
    private int size;

    // 空参构造
    public ArrayLoopQueeu() {
        this(10);
    }

    // 带参构造
    public ArrayLoopQueeu(int capacity) {
        data = (E[]) new Object[capacity];
        // 初始时，首尾位置相同
        front = 3;
        tail = 3;
        size = 0;
    }

    @Override
    /**
     * 俩种情况都可以判断为空（size为0也是空）
     */
    public boolean isEmpty() {
        // 首位相等时为空
        return front == tail;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    // 入队
    public void enqueue(E e) {
        // 判断是否需要扩容
        if ((tail + 1) % data.length == front) {
            // 扩容
            resize(2 * size);
        }
        // 将新元素添加到 tail 指定位置
        data[tail] = e;
        // 维护tail
        tail = (tail + 1) % data.length;
        // 维护size
        size++;
    }

    /**
     * 重置容量
     *
     * @param newCapacity 新容量
     */
    public void resize(int newCapacity) {
        // 创建新数组
        E[] newData = (E[]) new Object[newCapacity];
        // 挪动， 遍历新数组从头开始的位置，往进放对应的元素
        for (int i = 0; i < size; i++) {
            // 扩容时，新数组的 i 位置元素， 应该是 旧数组的 i + front 取余 旧数组长度 位置的元素
            newData[i] = data[(i + front) % data.length];
        }
        // 维护front  tail
        front = 0;
        tail = size;
        // 更新
        data = newData;
    }

    @Override
    /**
     * 出队
     */
    public E dequeue() {
        // 判断队列中是否存在元素
        if (size == 0) {
            throw new RuntimeException("队列为空，无元素出队");
        }
        // 保存要出队的元素
        E del = data[front];
        // 维护front
        front = (front + 1) % data.length;
        // 维护size
        size--;
        // 是否缩容
        if (size == data.length / 4 && data.length / 2 >= 10) {
            resize(data.length / 2);
        }
        return del;
    }

    @Override
    public String toString() {
        String str = "";
        str += "[";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
            if (i != data.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}

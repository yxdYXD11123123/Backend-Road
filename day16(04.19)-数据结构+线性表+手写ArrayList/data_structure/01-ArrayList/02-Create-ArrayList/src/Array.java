/**
 * 使用顺序结构实现线性表
 * 使用数组实现线性表
 * 手写ArrayList
 *
 *
 * 本类中需要有哪些属性？
 * 1.数组：存放元素
 * 2.size：元素的个数
 *
 * 3.构造方法：空参构造，带参构造
 * 4.容量getCapacity：可以存放多少元素
 * 5.判断是否为空：size = 0
 *
 */
public class Array {
    // 数组
    private int[] data;
    // 元素个数
    private  int size;

    // 空参构造
    public Array() {
        // 初始化大小为10的容器
        this(10);
    }

    // 满参构造
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 获取容量
    public int getCapacity() {
        return data.length;
    }

    // 获取元素个数
    public int getSize() {
        return  size;
    }

    // 是否为空
    public boolean isEmpty() {
        return size == 0;
    }
}

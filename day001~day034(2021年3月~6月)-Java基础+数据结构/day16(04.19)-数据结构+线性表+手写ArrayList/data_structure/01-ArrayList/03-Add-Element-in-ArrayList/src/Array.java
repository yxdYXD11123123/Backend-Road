import java.util.Arrays;

/**
 * 使用顺序结构实现线性表
 * 使用数组实现线性表
 * 手写ArrayList
 * <p>
 * <p>
 * 本类中需要有哪些属性？
 * 1.数组：存放元素
 * 2.size：元素的个数
 * <p>
 * 3.构造方法：空参构造，带参构造
 * 4.容量getCapacity：可以存放多少元素
 * 5.判断是否为空：size = 0
 */
public class Array {
    // 数组（此数组内容中的元素不一定全都是Array的元素，因为此数组的长度是容量大小，未必与Array实例的size大小相等）
    private int[] data;
    // 元素个数（Array的真实长度）
    private int size;

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
        return size;
    }

    // 是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 向数组中新增元素
    // 向index为2的位置新增元素
    public void add(int index, int e) {
        // 极端情况：
        // 数组满了
        if (size == data.length)
            throw new RuntimeException("数组已满，请先扩容");
        // 索引 < 0 或 索引 > size
        // 之所以判断 index > size 阻止添加，是因为即使data数组还有容量空间让我们添加，
        // 但是超过了Array的size，后面的元素添加是没有意义的
        if (index < 0 || index > size)
            throw new RuntimeException("索引非法");
        // 1. 挪, 从最后一位(size)开始往后挪元素，挪到新元素要插入的位置(index)
        for (int i = size - 1; i >= index; i--) {
            // size为0，index为0时，-1>=0为不满足循环条件,不会进入循环，也就不需要挪，直接下一步进行添加
            data[i + 1] = data[i];
        }
        // 赋值
        data[index] = e;
        // 维护size
        size++;
    }

    // 专门在数组的头部添加：头插法
    public void addFirst(int e) {
        add(0, e);
    }

    // 专门在数组的尾部添加：尾插法
    public void addLast(int e) {
        add(size, e);
    }

    // 查找（1.根据索引查找值 2.根据值查找索引）
    // 1.根据索引查找值
    public int get(int index) {
        // index一定要在0 到 size-1的范围之内
        if (index<0 || index>=size) {
            throw new RuntimeException("索引非法");
        }
        return data[index];
    }

    // 2.根据值查找索引 相当于以前的indexOf
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            // 找到返回索引
            if (data[i]==e){
                return i;
            }
        }
        // 找不到返回 -1
        return  -1;
    }

    // 修改
    public void set(int index, int e) {
        if (index<0 || index>=size) {
            throw new RuntimeException("索引非法");
        }
        data[index] = e;
    }


    @Override
//    public String toString() {
//        return "Array{" +
//                "data=" + Arrays.toString(data) +
//                ", size=" + size +
//                '}';
//    }
    public String toString() {
        String str = "[";
        // 其实这里应该用size，因为data.length实际上是跟着容量走的，
        // 所以打印出来的内容可能会包含 不属于Array实例中实际元素的默认值（0）
        // 暂时用data.length是为了看到元素的挪动
        for (int i = 0; i < data.length; i++) {
            str += data[i];
            if (i != data.length - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}

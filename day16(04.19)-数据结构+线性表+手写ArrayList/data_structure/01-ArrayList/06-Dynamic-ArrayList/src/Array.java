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
 * <p>
 * 要让Array支持泛型
 *
 * @param <E> E 代表元素类型 （常用E T V K）
 */
public class Array<E> {
    // 数组（此数组内容中的元素不一定全都是Array的元素，因为此数组的长度是容量大小，未必与Array实例的size大小相等）
    private E[] data;
    // 元素个数（Array的真实长度）
    private int size;

    // 空参构造
    public Array() {
        // 初始化大小为10的容器
        this(10);
    }

    // 满参构造
    public Array(int capacity) {
        // new E[capacity]报错，原因：new 后跟的应该是类
        // 因为Object可以接收任何类型，所以
        // 创建一个Object类型的数组，然后将他的类型转换为E[]
        // 不过这样修改后，数组中元素只能存放引用类型
        data = (E[]) new Object[capacity];
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
    public void add(int index, E e) {
        // 极端情况：
        // 数组满了
        if (size == data.length) {
            // 扩容
            // throw new RuntimeException("数组已满，请先扩容");
            // 扩容俩倍
            resize(data.length * 2);
        }
        // 索引 < 0 或 索引 > size
        // 之所以判断 index > size 阻止添加，是因为即使data数组还有容量空间让我们添加，
        // 但是超过了Array的size，后面的元素添加是没有意义的
        if (index < 0 || index > size)
            throw new RuntimeException("索引非法");
        // 1. 挪, 从最后一位(size)开始往后挪元素，挪到新元素要插入的位置(index)
        for (int i = size - 1; i >= index; i--) {
            // size为0，index为0时，-1>=0不满足循环条件,不会进入循环，也就不需要挪，直接下一步进行添加
            data[i + 1] = data[i];
        }
        // 赋值
        data[index] = e;
        // 维护size
        size++;
    }

    // 专门在数组的头部添加：头插法
    public void addFirst(E e) {
        add(0, e);
    }

    // 专门在数组的尾部添加：尾插法
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 扩容方法（可扩可缩）
     *
     * @param newCapacity 新容量
     */
    public void resize(int newCapacity) {
        // 创建新的数组
        E[] newData = (E[]) new Object[newCapacity];
        // 复制原来的元素
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        // 覆盖旧数组
        data = newData;
    }

    // 查找（1.根据索引查找值 2.根据值查找索引）
    // 1.根据索引查找值
    public E get(int index) {
        // index一定要在0 到 size-1的范围之内
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引非法");
        }
        return data[index];
    }

    // 2.根据值查找索引 相当于以前的indexOf
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            // 找到返回索引
//            if (data[i]==e){
//                return i;
//            }
            // 在java中==比较的是内存地址，equals比较的是值
            if (data[i].equals(e)) {
                return i;
            }
        }
        // 找不到返回 -1
        return -1;
    }

    // 修改
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引非法");
        }
        data[index] = e;
    }

    // 是否包含某个元素
    // 包含返回true 不包含返回false
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    // 删除元素（三个方法）
    // 1.删除指定位置的值
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引非法");
        }
        // 先记录好旧值
        E oldValue = data[index];
        // 挪
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        // 最后一位恢复初始值（引用类型初始值就是null）
        data[size - 1] = null;
        // 维护size
        size--;

        // 缩容
        // 解决复杂度震荡问题
        if (size == data.length / 4 && data.length / 2 >= 10) {
            // 缩容一半
            resize(data.length / 2);
        }

        // 返回旧值
        return oldValue;
    }

    // 2.删除头部元素
    public E removeFirst() {
        return remove(0);
    }

    // 3.删除尾部元素
    public E removeLast() {
        return remove(size - 1);
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

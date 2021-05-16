public interface IQueue<E> {
    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 获取长度
     * @return
     */
    int getSize();

    /**
     * 取队首
     * @return
     */
    E peek();

    /**
     * 入队
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     * @return
     */
    E dequeue();
}

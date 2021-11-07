public class ArrayListQueue<E> implements IQueue<E> {
    private Array<E> arrayListQueue;

    public ArrayListQueue() {
        arrayListQueue = new Array<>();
    }

    @Override
    public boolean isEmpty() {
        return arrayListQueue.isEmpty();
    }

    @Override
    public int getSize() {
        return arrayListQueue.getSize();
    }

    @Override
    /**
     * 取队首
     */
    public E peek() {
        return arrayListQueue.getFirst();
    }

    @Override
    /**
     * 入队
     */
    public void enqueue(E e) {
        arrayListQueue.addLast(e);
    }

    /**
     * 出队
     * @return
     */
    @Override
    public E dequeue() {
       return arrayListQueue.removeFirst();
    }
}

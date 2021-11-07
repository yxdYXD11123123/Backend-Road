public class ArrayListStack<E> implements IStack<E>{
    private Array<E> array;

    public ArrayListStack() {
        this.array = new Array<>();
    }

    public ArrayListStack(int capacity) {
        this.array = new Array<>(capacity);
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}

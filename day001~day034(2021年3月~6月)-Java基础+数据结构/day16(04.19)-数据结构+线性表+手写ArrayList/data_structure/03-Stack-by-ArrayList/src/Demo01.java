public class Demo01 {
    public static void main(String[] args) {
        ArrayListStack<String> listStack = new ArrayListStack<>();
        System.out.println( listStack.isEmpty());
        System.out.println(listStack.getSize());
//        System.out.println(listStack.peek());
        listStack.push("2222");
        System.out.println(listStack);
        System.out.println(listStack.peek());
        listStack.pop();
        System.out.println(listStack);

    }
}

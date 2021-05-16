public class Demo01 {
    public static void main(String[] args) {
        ArrayLoopQueeu<String> loopQueeu = new ArrayLoopQueeu<>(5);
        loopQueeu.enqueue("111");
        loopQueeu.enqueue("111");
        loopQueeu.enqueue("111");
        System.out.println(loopQueeu);
    }
}

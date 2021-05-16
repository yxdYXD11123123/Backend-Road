public class Demo01 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.println('y');
            innter:
            for (int j = 0; j < 9; j++) {
                System.out.println('x');
                // 跳过外层循环
                continue outer;
            }
        }
    }
}

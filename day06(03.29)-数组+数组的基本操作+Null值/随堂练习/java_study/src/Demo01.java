public class Demo01 {
    public static void main(String[] args) {
//        打印三角形
        for (int i = 0; i < 5; i++) {
            String str = "";
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        打印倒三角形
        for (int i = 5; i >= 1; i--) {
            String str = "";
            for (int k = 1; k < i; k++) {
                str += "* ";
            }
            System.out.println(str);
        }
    }
}

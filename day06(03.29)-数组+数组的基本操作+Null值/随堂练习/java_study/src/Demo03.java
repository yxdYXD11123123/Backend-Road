public class Demo03 {
    public static void main(String[] args) {
//        打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            String str = "";
            for (int j = 1; j <= i; j++) {
                str += j + "x" + i + "=" + i*j + " ";
            }
            System.out.println(str);
        }
    }
}

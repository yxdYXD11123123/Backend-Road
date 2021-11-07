public class Demo02 {
    public static void main(String[] args) {
//        打印等腰三角形
        for (int i = 1; i <= 5; i++) {
            String str = "";
            for (int j = 1; j <= 5-i; j++) {
                str += " ";
            }
            for (int k = 0; k < i; k++) {
                str += "* ";
            }
            System.out.println(str);
        }
        int x = 1;
        for (int i = 0; i < 3; i++) {
            for (; x <=3; x++) {

            }
            System.out.println(x);
        }

    }
}

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        // if语句
        int age = Integer.parseInt(str);
        if (age >= 18) {
            System.out.println("您已成年");
        } else {
            System.out.println("未成年不能进入");
        }
    }
}

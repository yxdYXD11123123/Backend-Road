import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的性别");
        String gender = input.next();
        System.out.println("请输入您的姓名");
        String name = input.next();
        System.out.println(name=="ff");
        gender = "0";
        System.out.println(gender=="0");
        if (gender=="0"){
            System.out.println("欢迎"+name+"女士");
        }


    }
}

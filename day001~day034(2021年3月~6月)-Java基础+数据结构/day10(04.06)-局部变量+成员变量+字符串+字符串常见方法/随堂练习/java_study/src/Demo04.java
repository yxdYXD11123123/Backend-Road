import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        String str = " welcome to java ";
        System.out.println(str.trim());  // welcome to java
        System.out.println(str.toUpperCase()); //  WELCOME TO JAVA
        System.out.println(str.substring(4)); // come to java
        System.out.println(str.substring(2,3)); //e
        System.out.println(str.replace("to", "come to")); //  welcome come to jav

        System.out.println(str.toCharArray()[2]);
        // 直接打印时，相当于 将 str进行toString 然后打印
        System.out.println(str);
        System.out.println(str.toString());

        //
        String str1 = "abc.def";
        // 以 . 分割
        String[] arr = str1.split(".");
        // 得到 [] 空数组，是因为 . 代表所以
        System.out.println(Arrays.toString(arr));
        // 需要使用 \\ 来转义字符
        String[] arr1 = str1.split("\\.");
        System.out.println(Arrays.toString(arr1)); // [abc, def]
    }
}

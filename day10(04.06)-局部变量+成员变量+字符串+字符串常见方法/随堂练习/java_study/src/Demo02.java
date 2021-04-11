public class Demo02 {
    public static void main(String[] args) {
        char[] arr = {'1', '1'};
        // 将char数组完整变成字符串
        String str = new String(arr);
        System.out.println(str);  // "1"

        // 将char数组，截取指定一段变为字符串
        String str2 = new String(arr, 1, 1);
        System.out.println(str2);
    }
}

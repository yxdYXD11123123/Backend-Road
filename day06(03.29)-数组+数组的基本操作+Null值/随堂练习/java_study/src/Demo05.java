public class Demo05 {
    public static void main(String[] args) {
        byte[] arr = new byte[]{'1', 0};
        System.out.println(arr[0]); // 49

        String[] str = new String[1];
        System.out.println(str[0]); // null
        // 引用数据类型的默认值都是null

        char[] chars = new char[1];
        System.out.println(chars[0]); // 一个空字符（空格）

        boolean[] flags = new boolean[1];
        System.out.println(flags[0]); // false

        double[] doubles = new double[1];
        System.out.println(doubles[0]); // 0.0
        doubles[0] = '2';
        System.out.println(doubles[0]); // 50.0
    }
}

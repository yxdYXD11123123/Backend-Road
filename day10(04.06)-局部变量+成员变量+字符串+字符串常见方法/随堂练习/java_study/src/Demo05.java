public class Demo05 {
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(str.length()); // 3
        // 比较俩个字符串的先后大小顺序
        String s1 = "abc", s2 = "def";
        System.out.println(s1.compareTo(s2));  // -3 负数，s2更大

        // 拼接
        System.out.println(s1.concat(s2)); // abcdef
    }
}

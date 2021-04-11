public class Demo01 {
    public static void main(String[] args) {
        System.out.println(turnUpper("aBc", false));
        System.out.println(countChar("abbc", 'x'));
        System.out.println(returnNewStr("abcab"));
    }

    public static String turnUpper(String str, Boolean flag) {
        return  flag ? str.toUpperCase(): str.toLowerCase();
    }

    public static int countChar(String str,char c) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                count++;
            }
        }
        return count;
    }

    public  static  String returnNewStr(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'a' && arr[i] != 'A') {
//                将字符转为大写字符
//                方式一：
//               arr[i] = Character.toUpperCase(arr[i]);
//                方式二：
//                先转为字符串
                String temp = arr[i] + "";
//                变大写
                temp = temp.toUpperCase();
//                再使用charAt
                arr[i] = temp.charAt(0);
            }
        }
        return new String(arr);
    }
}

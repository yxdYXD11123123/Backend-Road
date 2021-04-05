public class Demo06 {
    public static void main(String[] args) {
        // 数组遍历
        int[] arr = new int[]{33, 44, 55, 66};
        // 正序遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 倒序遍历
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        int[] list = null;
        System.out.println(list); //null
//        System.out.println(list[0]); //NullPointerException

        int a = 10;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}

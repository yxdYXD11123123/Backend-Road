public class Main {
    public static void main(String[] args) {
        // 数组创建方式
        // 方式一
        int[] arr1 = new int[10];
        // 方式二
        int[] arr2 = new int[]{1, 2, 4};
        // 方式三
        int[] arr3 = {1, 2, 3, 4, 5};

        // 数组的遍历方式
        // 基本遍历
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 增强for循环
        for (int num : arr2) {
            System.out.println(num);
        }

        // 获取某个位置
        System.out.println(arr3[0]);

        // 删除某个位置的值
        // 位置 1
        // 从 索引 1 的位置开始往前挪
        for (int i = 1; i < arr3.length; i++) {
            // 把后面的值往前挪
            arr3[i] = arr3[i+1];
        }
    }
}
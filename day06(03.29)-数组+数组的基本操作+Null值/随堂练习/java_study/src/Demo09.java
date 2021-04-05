public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {99, 44, 55, 11, 22, 11};
        // 冒泡排序
        // 第几轮
        for (int i = 1; i < arr.length; i++) {
            // 每轮 从开始位置 排， 排到->上一轮的剩下需要排的位置
            // 第一轮  0 - 3  确定好最后一位
            // 第二轮  0 - 2  确定好倒数第二位
            for (int j = 0; j < arr.length - i; j++) {
                // 相邻元素 比较大小
                if (arr[j] > arr[j + 1]) {
                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

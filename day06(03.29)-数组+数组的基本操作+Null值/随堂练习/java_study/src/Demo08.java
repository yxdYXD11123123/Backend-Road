public class Demo08 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        // 遍历数组长度一半的索引
        for (int i = 0; i < arr.length/2; i++) {
            // 将前后对应位置的指进行交换
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        // 展示
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

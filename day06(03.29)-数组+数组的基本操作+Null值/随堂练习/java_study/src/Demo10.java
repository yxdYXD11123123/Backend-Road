public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {99, 44, 55, 11};
        // 选择排序
        // 第一轮确定第一个位置
        for (int i = 0; i < arr.length-1; i++) {
            // 遍历其余所有位置
            for (int j = i+1; j < arr.length; j++) {
                // 让第一个位置和所有其余位置相比
                if(arr[i] > arr[j]) {
                    // 依次排序好每个位置
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

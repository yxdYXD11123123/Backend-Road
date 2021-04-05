public class Demo04 {
    public static void main(String[] args) {
        // 数组
        int[] arr =  new int[5];
        System.out.println(arr.length);
        System.out.println(arr[0]);
        // 完整型  默认长度为元素长度  3
        int[] arr2 = new int[]{11,22,33};
        System.out.println(arr2[0]);
        // 简化赋值型
        int[] arr3 = {1,2,3};
        arr3 = new int[]{2,3,4};
        System.out.println(arr3[2]);


    }
}

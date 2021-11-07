public class Demo01 {
    public static void main(String[] args) {

    }
    // 空间复杂度 O(n)
    void print(int n) {
        int i = 0;
        int[] arr = new int[n];
        for (i = 0; i < arr.length; i++) {
            arr[i] = i* i;
        }
    }
}

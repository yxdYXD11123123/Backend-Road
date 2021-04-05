public class Demo07 {
    public static void main(String[] args) {
        String[] arr = {"aa", "bb", "cc", "dd", "ee"};
        String temp = arr[2];
        arr[2] = arr[4];
        arr[4] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

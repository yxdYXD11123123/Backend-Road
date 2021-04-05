public class Demo02 {
    public static void main(String[] args) {
        // 取出数字中的某一位
        int num = 8496;
        // 取出个位
        System.out.println(num%10); // 6
        // 取出十位
        System.out.println(num%100/10); // 9
        // 取出百位
        System.out.println(num%1000/100); // 4
        // 取出千位
        System.out.println(num%10000/1000); // 8
    }
}

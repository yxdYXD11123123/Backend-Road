
public class Main {
    public static void main(String[] args) {
        Array arr = new Array(5);
//        arr.add(0, 10);
//        System.out.println(arr); // [10,0,0,0,0]
//        // 可以紧跟着添加
//        arr.add(1, 20);
//        System.out.println(arr);
        // 不可以跳过添加
        // arr.add(3, 25); // 报错，超出size

        arr.addLast(119);
        System.out.println(arr);
        System.out.println(arr.get(0));
    }
}

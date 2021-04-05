public class Demo04 {
    public static void main(String[] args) {
       // 控制循环的流程关键字
        int i = 1;
        int times = 0;
        while (i<=100) {
            if (i%17==0) {
                System.out.println(i);
                times++;
            }
            // 自增
            i++;
        }
        System.out.println(times);
    }
}

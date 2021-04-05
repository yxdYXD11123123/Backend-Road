public class Demo01 {
    public static void main(String[] args) {
        // 普通调用
        Demo01.show();
        System.out.println(Demo01.getPI());
        System.out.println(Demo01.getSum(1,2));
        // 快捷键 ctrl+p
        // 本类内部调用
        show();
    }
    /**
     *  控制台展示公式
     *  没有返回结果 void 无返回值
     *  没有参数列表：不需要从外界传入数据
     */
    public  static void show() {
        System.out.println("圆的面积=半径*半径*Π");
    }
    /**
     * 返回Π
     * 有返回值：double 方法执行结束，会有小数结果进行返回
     * 没有参数列表，不需要从外界传入数据
     * 注意：方法只要有返回值，在方法体末位必须使用return进行返回值
     */
    public  static  double getPI() {
        return 3.14159265;
    }
    /**
     * 返回俩个整数的加法结果
     * 有返回值：int
     * 有参数列表：俩个参数（int）
     */
    public  static int getSum(int num1, int num2) {
        return  num1 + num2;
    }
}

package packageTwo;

// 圆
public class Circle implements Computable {
    @Override
    // x 为半径
    public double area(double x) {
        return 3.14 * x * x;
    }
}

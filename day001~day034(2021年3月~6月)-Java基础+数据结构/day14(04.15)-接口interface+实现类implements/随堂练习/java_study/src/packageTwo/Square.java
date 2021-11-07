package packageTwo;

// 正方形
public class Square implements Computable {
    @Override
    // x 为 边长
    public double area(double x) {
        return x * x;
    }
}

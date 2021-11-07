package packageOne;

public class Lecturer implements Management {
    @Override
    public void check() {
        System.out.println("讲师检查作业");
    }

    @Override
    public void exam() {
        System.out.println("讲师考试");
    }
}

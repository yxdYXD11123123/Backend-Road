package packageOne;

public class ClassTeacher implements Management {
    @Override
    public void check() {
        System.out.println("班主任检查作业");
    }

    @Override
    public void exam() {
        System.out.println("班主任考试");
    }
}

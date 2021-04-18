public class Employee {
    // 姓名
    private String name;
    // 职位
    private String position;
    // 薪水
    private double sal;
    // 年终奖
    private double award;

    // 全参构造函数
    public Employee(String name, String position, double sal) {
        this.name = name;
        // 调用自身方法，设置值
        setPosition(position);
        setSal(sal);
        setAward();
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        // 只能设置 员工 或 经理
        if (position=="员工" || position == "经理") {
            this.position = position;
            // 更新奖金信息
            setAward();
        } else {
            System.out.println("职位只有员工或经理");
        }

    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        // 不能设置为负数
        if (sal<0) {
            System.out.println("薪资不能设置为负数");
        }
        this.sal = sal<0?0:sal;
        // 更新奖金信息
        setAward();
    }

    public void setAward() {
        // 是经理有奖金
        this.award = this.position == "经理"? 12*sal: 0;
    }

    public double getAward() {
        return award;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", sal=" + sal +
                ", award=" + award +
                '}';
    }
}

public class Demo04 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("frank", "副经理", -100);
        System.out.println(employee1); // 设置职位，薪资失败
        Employee employee2 = new Employee("frank", "经理", 11100);
        System.out.println(employee2.getAward()); // 133200.0
        // 修改薪资
        employee2.setSal(160);
        // 查看奖金
        System.out.println(employee2.getAward()); // 1920.0
        // 修改职位
        employee2.setPosition("员工");
        System.out.println(employee2.getAward()); // 0
    }
}

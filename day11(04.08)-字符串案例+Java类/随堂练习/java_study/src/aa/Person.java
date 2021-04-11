package aa;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 姓名  alt+insert
     String name;

    public String getPassword() {
        return password;
    }

    // 银行卡密码 (默认外界随便使用)
    private String password;

    // 设置密码
    public void setPassword(String password) {
        // 权限校验
        this.password = password;
    }
}

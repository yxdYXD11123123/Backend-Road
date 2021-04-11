public class Phone {
    private String pname;
    private int money;
    private char level;
    private String color;

    public void run() {
        System.out.println(pname);  // 就近原则 this.pname
        run2(); // 默认为 this.run2()
    }

    public void run2() {
        System.out.println("run2");
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

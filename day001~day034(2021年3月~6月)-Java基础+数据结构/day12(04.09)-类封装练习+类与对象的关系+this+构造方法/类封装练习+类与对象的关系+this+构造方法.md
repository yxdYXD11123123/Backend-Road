## 类封装练习

#### 封装一个 “手机” 类

```java
// 封装
public class Phone {
    private String pname;
    private int money;
    private char level;
    private String color;

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

public class Demo01 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setPname("华为");
        p.setMoney(3000);
        p.setLevel('A');
        p.setColor("red");
    }
}
```



## 类与对象的关系

Java类 -- 设计图纸

对象 -- 参照图纸，生成出来的产品

### 关系

* 类是对象的抽象化
* 对象是类的实例化 `new`



## this 关键字

this：<font color=red>当前对象</font>  当前调用该方法、该类的对象

关键字保存的都是 <font color=red>对象的地址</font>

this 关键字在java中可用于调用成员变量、成员方法、构造方法

* 成员变量的调用：this.成员变量名
* 成员方法的调用：this.成员方法名

```java
public class Phone {
    private String pname;
    private int money;
    private char level;
    private String color;
    
    public void run() {
        System.out.println(pname);  // 就近原则 this.pname
        run2(); // 默认为 this.run2()
    }
}
```



# 面向对象

## 构造方法

使用类创建对象时，成员变量有俩种赋值方式（定义成员变量时直接赋值、使用`setName`方法为成员变量赋值）

其实，除了这俩种方式，**构造方法** 也能为成员变量赋值

### 概述

构造方法是所有Java类都一定会有的特殊方法

官方定义：<font color=red>专门在创建对象时使用的方法</font>

一个类只有拥有构造方法，外界才能使用new 关键字为它创建对象

#### 作用

1. 用来创建对象
2. 为成员变量赋值

### 简单的定义以及使用格式

``` java
成员变量...
public 类名() {
    
}
成员方法...
```

```java
public class Person {
    private String name;

    // 创建实例时执行的构造函数
    public Person() {
        System.out.println(1111);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

#### 注意：

* 构造方法没有返回值和返回值类型，方法内也无需使用return关键字
* <font color=red>方法名必须和类名一致</font>

#### 使用格式

```java
new 类名()
```

new 关键字的 意思是调用构造方法，创建对象。

类名() 就是被调用的构造方法



#### 带有参数的定义及使用格式

```java
成员变量....
public 类名(参数类型 参数1，参数类型 参数2，....) {

}
```

使用：

```java
new 类名(参数1, 参数2....)
```

```java
public class Person {
    private String name;

    // 创建实例时执行的构造函数
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

```java
public class Demo01 {
    public static void main(String[] args) {
        // 带参数的创建
        Person person = new Person("frank");
        System.out.println(person.getName()); // frank
    }
}
```



### 构造方法重载

```java
public class C {
    private String n1;
    private String n2;
    private String n3;

    public C(String n1, String n2, String n3) {
        System.out.println("构造方法一");
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public C() {
        System.out.println("构造方法二");
    }
}
```

```java
public class Demo02 {
    public static void main(String[] args) {
        C c = new C(); // 使用了构造方法二
        C c2 = new C("1", "2","3");  // 使用构造方法一
    }
}
```



#### 注意：

在一个正常的Java类中，构造方法是<font color=red>必须存在的</font>。

* 如果我们<font color=red>没有定义构造方法，Java会自动补齐一个无参的构造方法</font>（特点：<font color=red>public、无参数、无内容</font>）
* 如果我们定义了任何构造方法，Java则遵守程序员的定义，不会在自动补齐构造方法



### 构造方法的定义习惯

学习阶段，我们创建一个Java类，会习惯性定义至少俩个构造方法

* 无参构造（必须创建出来，方便我们后期，java不自动补齐无参构造时，无参创建对象）
* 带参构造（满参构造）
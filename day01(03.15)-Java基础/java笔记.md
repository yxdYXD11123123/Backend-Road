## java基础

没新建一个java文件，就是在定义一个全新的java类

<font color=red>所有的java类（java文件），必须存放在项目的src文件夹中，否则无法执行</font>

```java
public class Demo1 {
    // 执行代码的开始位置
    // main是规定必须的，否则找不到执行入口
    // 所有java程序，必须有main方法，才可以执行，main方法是程序的入口
    public static void main(String[] args) {
        // println 是打印并换行
        System.out.println("你好");
        String name = "frank";
        // print 是不换行
        System.out.print(name);
    }
}
```

快捷写法：`psvm` 书写main入口

#### 注意：

* 一个Java类只能最多拥有一个main方法
* Java 代码必须以 `;` 结尾， 类似于`{}`这样的代码边界，无需加`;`

### 今日关键字

关键字：被 Java语言赋予特殊含义，具有专门用途的单词。

每个关键字都有<font color=red>固定的用法</font>和<font color=red>固定位置</font>

学习 java 语言基础，实际上就是学习各种关键字如何使用的过程

注：关键字均为小写

----

* public：公共的
* class：类
* static：静态的
* void：空的

----


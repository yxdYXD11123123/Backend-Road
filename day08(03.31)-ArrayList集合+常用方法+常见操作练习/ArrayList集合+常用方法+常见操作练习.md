## 引用数据类型 ArrayList

### 简介

虽然在Java中数组是运算速度最快的容器，但是在实际开发过程中，使用最频繁的数据容器并不是数组，而是`ArrayList`

因为数组虽然简单好用，但是<font color=red> 数组必须提前赋值、提前规定长度</font>

而我们大部分数据是<font color=red>会动态改变的，不适合存放数组</font>中。

ArrayList <font color=red>底层是数组</font>，"动态"数组

#### 和数组对比

ArrayList 与数组的存储方式类似，均将元素从0开始编号

但是它比数组更方便：

* 长度动态改变
* 比数组拥有更多强大的功能方法

（数组是一个普通人，ArrayList 可以理解为一个超人）

### 为什么称为集合

因为 ArrayList 可以像数组一样，将<font color=red>数据集中保存</font>在一起

本身又<font color=red>集成了大量功能方法</font>

所以我们将其称为<font color=red>集合</font>



### 定义和使用

所属包：`java.util.ArrayList`

创建对象方式（特殊）：

和数组一样，也必须提前规定数据类型

<font color=red>`类名<集合内元素类型> 变量名 = new 类名<集合内元素类型>()`</font>

例如：

```
 ArrayList<Integer> list = new ArrayList<>();
```



#### 注意：

* 类型不能使用基本数据类型，<font color=red>使用基本数据类型对应的引用数据类型写法</font>

  首字母大写：byte、short、long、float、double、boolean

  特殊：int--> Integer 、 char-->Character

* 集合规定什么类型，就只能存储或者获取什么类型

* 遍历集合时，我们需要使用 `.size()` 和 `.get()`

### 方法

* `add(元素)`

  向集合末尾添加元素

* `size()`

  返回数组长度（int类型）

  ```java
  import java.util.ArrayList;
  
  public class Demo02 {
      public static void main(String[] args) {
          ArrayList<Integer> list =  new ArrayList<>();
          list.add(1);
          list.add(2);
          System.out.println(list.size()); //2
      }
  }
  ```

* `get（索引）`

  根据索引获取元素中某个元素

  ```java
  import java.util.ArrayList;
  
  public class Demo02 {
      public static void main(String[] args) {
          ArrayList<Integer> list =  new ArrayList<>();
          list.add(1);
          list.add(99);
          System.out.println(list); // [1, 99]
          System.out.println(list.get(1)); // 99
      }
  }
  ```

  

#### 集合遍历

```java
import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        // 遍历集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        // 正向遍历  集合名.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 逆向遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
```

#### 快捷添加

`Collections.addAll(集合名，元素1，元素2....);`

```java
import java.util.ArrayList;
import java.util.Collections;

public class Demo04 {
    public static void main(String[] args) {
//        快捷添加
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "aa", "bb");
        System.out.println(strings);
    }
}
```



#### 练习案例

* 求和

```java
import java.util.ArrayList;
import java.util.Collections;

public class Demo05 {
    public static void main(String[] args) {
        // 求11,22,33,44,55,66之和
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11,22,33,44,55,66);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
```

* 求平均数

```java
import java.util.ArrayList;
import java.util.Collections;

public class Demo06 {
    public static void main(String[] args) {
    //  求平均数
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 22, 33, 44, 55, 66);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
//        注意：想要得到小数时，需要使用1.0*
        double avg =1.0 * sum / list.size();
        System.out.println(avg); // 38.5
    }
}
```

* 求最大值，最小值

```java
import java.util.ArrayList;
import java.util.Collections;

public class Demo07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 55, 1, 44, 88, 66);
        // 声明最大 ，最小数
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }else if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(max);  // 88
        System.out.println(min);  // 1
    }
}
```

* 寻找元素索引

```java
import java.util.ArrayList;
import java.util.Collections;

public class Demo08 {
    public static void main(String[] args) {
        // 在集合中寻找元素x（x可以为任意整数）
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 66, 55, 2, 44, 88, 66);
        // 声明x
        int x = 55;
        // 准备记录元素索引，初始值为-1
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            // 如果找到相同元素
            if (list.get(i) == x) {
                // 记录索引
                index = i;
                // 结束循环，节省效率
                break;
            }
        }
        // 判断结果
        if (index == -1) {
            System.out.println("未找到元素"+x);
        }else {
            System.out.println("元素"+x+"的索引是"+index);
        }
    }
}
```


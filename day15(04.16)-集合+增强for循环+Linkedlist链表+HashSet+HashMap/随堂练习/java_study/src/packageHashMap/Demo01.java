package packageHashMap;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
HashMap<String, String> hMap = new HashMap<>();
String result = hMap.put("first", "one");
System.out.println(result); // 返回 null  表示添加成功
System.out.println(hMap); // {first=one}

String resultAgain = hMap.put("first", "two");
System.out.println(resultAgain); // one  返回旧值，表示新值覆盖旧值
        System.out.println(hMap); // {first=two}
    }
}

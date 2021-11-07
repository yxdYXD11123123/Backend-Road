package packageHashMap;

import java.util.HashMap;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("first", "one");
        hMap.put("second", "two");
        System.out.println(hMap.get("second")); // two
        System.out.println(hMap.get("third")); // null

        System.out.println(hMap.remove("second")); // two 返回被删除的值，表示成功
        System.out.println(hMap.remove("second")); // null 表示失败

    }
}

package packageHashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo03 {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("first", "one");
        hMap.put("second", "two");
        hMap.put("third", "three");

        // 方式一：
        // 通过 key 来获取 value
        // 快捷写法： map.keySet().for
        // keySet() 方法，可以将 map中的所有的key，转为一个Set集合返回给我们
        for (String key : hMap.keySet()) {
            // 拿到每个key之后，再用get获取key对应的value
            System.out.println(key + "--" + hMap.get(key));
        }

        // 方式二：
        // 通过键值对，直接把一个键值对的key和value获取到
        // map.entrySet()会把 每一对键值对封装在一个Set集合中返回
        for (Map.Entry<String, String> entry : hMap.entrySet()) {
            // Map.Entry 对象，有俩个方法： getKey() 获取键，getValue() 获取值
            System.out.println(entry.getKey()+"--"+entry.getValue());
            System.out.println(entry);
        }
    }
}

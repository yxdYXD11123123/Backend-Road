package packageOne;

import java.util.HashMap;

public class Demo05 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("宋江", "及时雨");
        map1.put("刘唐", "赤发鬼");
        // 遍历key, 通过key获取value   map.keySet().for
        System.out.println(map1.keySet());
        for (String key: map1.keySet()) {
            System.out.println(key+":"+map1.get(key));
        }
    }
}

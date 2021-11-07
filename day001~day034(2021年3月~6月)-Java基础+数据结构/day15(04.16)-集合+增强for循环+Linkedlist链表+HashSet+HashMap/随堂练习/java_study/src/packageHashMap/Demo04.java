package packageHashMap;

import java.util.HashMap;

public class Demo04 {
    public static void main(String[] args) {
        HashMap<String, Person> personMap = new HashMap<>();
        personMap.put("第一个", new Person("frank", 22));
        personMap.put("第二个", new Person("link", 12));
        personMap.put("第三个", new Person("drink", 23));

        Person result = personMap.get("第二个");
        System.out.println(result); // Person{name='link', age=12}
    }
}

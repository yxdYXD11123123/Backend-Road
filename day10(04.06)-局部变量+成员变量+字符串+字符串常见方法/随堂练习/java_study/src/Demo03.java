public class Demo03 {
    public static void main(String[] args) {
        String str = "helloWorld";
        System.out.println(str.startsWith("h")); // true
        System.out.println(str.endsWith("D")); // false
        System.out.println(str.contains("W")); // true
        System.out.println(str.equals("helloworld")); // false
        System.out.println(str.equalsIgnoreCase("helloworld")); // true
        System.out.println(str.isEmpty()); // false
    }
}

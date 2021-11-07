public class Demo03 {
    public static void main(String[] args) {
        int x = 99;
        if (x <= 80 && x >= 60 || x >= 90 && x <= 100) {
            System.out.println(x);
        }
        int score = 70;
        if (score >= 90) {
            System.out.println("A+");
        } else if (score >= 80) {
            System.out.println("A");
        } else if (score >= 75) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

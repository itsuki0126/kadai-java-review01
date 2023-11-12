
public class Triangle {

    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        int c = 8;

        if (a == b && a == c) {
            System.out.println("正三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("二等辺三角形");
        } else {
            System.out.println("不等辺三角形");
        }
    }
}


public class clock {

    public static void main(String[] args) {
        int result = getSeconds(18 ,32 ,47);
        System.out.println("経過時間は、" + result + "秒");
    }

    public static int getSeconds(int num1, int num2, int num3) {
        int result = num1 * 60 * 60 + num2 * 60 + num3;
        return result;
    }

}

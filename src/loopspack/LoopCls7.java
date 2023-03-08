package loopspack;

public class LoopCls7 {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        String c = "";

        for (int i = 1; i <= 4; i++) {
            b = b + "#";
            for (int j = 1; j <= 5; j++) {
                a = a + "*";
            }

        }
        c = c + "@";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

package task;

public class LoopCls0 {
    public static void main(String[] args) {
        String a = "";


        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 5; j++) {
                a = a + "*";
            }
            a = a + "\n";
        }
        System.out.println(a);
    }
}

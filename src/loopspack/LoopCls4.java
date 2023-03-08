package loopspack;

public class LoopCls4 {
    public static void main(String[] args) {
        String cem = "";

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;

            }
            cem = cem + i;

        }
        System.out.println("Cavabi " + cem);
    }
}

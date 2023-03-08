package loopspack;

public class LoopCls12 {
    public static void main(String[] args) {

        String netice = "";

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                netice+=i;

            }
            netice+="\n";
        }
        System.out.println(netice);
    }
}

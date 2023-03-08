package arrayspack;

public class ArrayCls10 {
    public static void main(String[] args) {
        int[] ededler = new int[10];
        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 40;
        ededler[3] = 64;
        ededler[4] = 54;
        ededler[5] = 68;
        ededler[6] = 37;
        ededler[7] = 80;
        ededler[8] = 72;
        ededler[9] = 50;

        int min = ededler[0];
        int max = ededler[0];

        for (int i = 0; i < ededler.length - 1; i++) {

            if (ededler[i] < min) {
                min = ededler[i];
            }

            if (ededler[i] > max) {
                max = ededler[i];
            }
        }
        System.out.println("minumum :" + min);
        System.out.println("maximum :" + max);

    }
}

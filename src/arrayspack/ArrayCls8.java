package arrayspack;

import java.util.Arrays;

public class ArrayCls8 {
    public static void main(String[] args) {
        int[] ededler = new int[5];
        ededler[0] = 45;
        ededler[1] = 57;
        ededler[2] = 40;
        ededler[3] = 64;
        ededler[4] = 54;

//        Arrays.sort(ededler);
//
//        int min = ededler[0];
//        int max = ededler[ededler.length - 1];

        int min = ededler[0];
        int max = ededler[0];

        for (int i : ededler) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("minimum : " + min);
        System.out.println("maximum : " + max);


    }
}

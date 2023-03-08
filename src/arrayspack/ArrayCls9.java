package arrayspack;

public class ArrayCls9 {
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


        int cutcem = 0;
        int tekcem = 0;
        int cutsay = 0;
        int teksay = 0;

//        for (int i = 0; i <= ededler.length - 1; i++) {
//            if (ededler[i] % 2 == 0) {
//                cutcem += ededler[i];
//                cutsay++;
//            } else {
//                tekcem += ededler[i];
//                teksay++;
//            }
//        }
        for (int a:ededler){
            if (a % 2 == 0) {
                cutcem += a;
                cutsay++;
            } else {
                tekcem += a;
                teksay++;
            }
        }

        System.out.println(cutcem);
        System.out.println(cutsay);
        System.out.println(tekcem);
        System.out.println(teksay);
    }

}

package randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = scanner.nextInt();
        Random random = new Random();
        int reded=random.nextInt(4);

        if (eded == reded){
            System.out.println("Tebrikler! 1000AZN qazandiniz :" + eded + " " +reded);

        }else {
            System.out.println("Teessuf! bextinizi bir daha sinayin :" + eded + " " +reded);
        }
    }
}

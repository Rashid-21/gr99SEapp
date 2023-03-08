package operatorspack;

import java.util.Scanner;

public class OperatorCls4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int a = scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = scanner.nextInt();

        String c = (a > b) ? "duzdur" : "sehvdir";
        System.out.println(c);
    }
}

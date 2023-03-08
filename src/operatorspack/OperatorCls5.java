package operatorspack;

import java.util.Scanner;

public class OperatorCls5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int a = scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = scanner.nextInt();

        int c = (a > b) ? 100 : 101;
        System.out.println(c);
    }
}

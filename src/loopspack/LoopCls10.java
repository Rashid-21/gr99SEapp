package loopspack;

import java.util.Scanner;

public class LoopCls10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("esasi daxil edin");
        int esas = sc.nextInt();
        System.out.println("quvveti daxil edin");
        int quvvet = sc.nextInt();

        int netice = 1;

        for (int i = 1; i <= quvvet; i++) {
            netice = netice * esas;
        }
        System.out.println("cavab : " + netice);
    }
}

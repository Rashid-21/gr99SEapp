package oop1;

import java.util.Scanner;

public class MethodCls1 {
    //geriye deyer qaytarandir yoxsa yox
    // hansi tip qayidacaq
    //parametrli ya bosh
    //neche dene hansi tip
    //qaytaran

    static String musMen(int eded) {

        String netice = "";

        if (eded > 0) {
            netice = "musbet";

        } else if (eded < 0) {
            netice = "menfi";
        } else {
            netice = "Sifir";

        }

        return netice;
    }

    static int lengthname(String a) {
        int uzunluq = a.length();
        return uzunluq;
    }

    static boolean Cutdurmu(int a) {
        boolean netice = false;
        if (a % 2 == 0) {
            netice = true;
        }
        return netice;

    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ededi daxil edin");
//        int a = scanner.nextInt();
//        String netice = musMen(a);
//        System.out.println(netice);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("soz daxil edin");
//        String b = sc.next();
//
//        int uzunluq = lengthname(b);
//        System.out.println(uzunluq);


        Scanner s = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int a = s.nextInt();
        boolean cutdurmu =Cutdurmu(a);
        System.out.println(cutdurmu);

    }
}
